package com.example.shop.member.service;

import com.example.shop.member.entity.Member;
import com.example.shop.member.dto.MemberCreateRequest;
import com.example.shop.member.dto.MemberUpdateRequest;
import com.example.shop.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class MemberService {
    Long createMember(MemberCreateRequest memberCreateRequest);
    List<Member> getAllMember();
    Member getMemberById(Long id);
    void updateMember(Long id, MemberUpdateRequest memberUpdateRequest);
    void deleteMember(Long id);

    @Service
    @RequiredArgsConstructor
    public static class MemberServiceImpl implements MemberService {

        private final MemberRepository memberRepository;

        @Override
        @Transactional
        public Long createMember(MemberCreateRequest request){
            Member existingMember = memberRepository.findByLoginId(request.getLoginId());
            if (existingMember != null) {
                throw new RuntimeException("이미 존재하는 로그인 아이디입니다: " + request.getLoginId());
            }

            Member member = new Member(
                    request.getLoginId(),
                    request.getPassword(),
                    request.getPhoneNumber(),
                    request.getAddress(),
                    0
            );

            memberRepository.save(member);

            return member.getId();
        }

        @Override
        @Transactional(readOnly = true)
        public List<Member> getAllMembers(){
            return memberRepository.findAll();
        }

        @Override
        @Transactional(readOnly = true)
        public Member getMemberById(Long id){
            Member member = memberRepository.findById(id);

            if (member == null) {
                throw new RuntimeException("회원을 찾을 수 없습니다.");
            }

            return member;
        }

        @Override
        @Transactional
        public void updateMember(Long id, MemberUpdateRequest request){
            Member member = memberRepository.findById(id);

            if (member == null) {
                throw new RuntimeException("회원을 찾을 수 없습니다.");
            }

            member.updateInfo(request.getPassword(), request.getPhoneNumber(), request.getAddress());
        }

        @Override
        @Transactional
        public void deleteMember(Long id){
            Member member = memberRepository.findById(id);

            if (member == null){
                throw new RuntimeException("회원을 찾을 수 없습니다.");
            }

            memberRepository.deleteById(id);
        }
    }
}

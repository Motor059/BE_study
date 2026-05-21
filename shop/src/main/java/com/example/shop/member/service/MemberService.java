package com.example.shop.member.service;

import com.example.shop.member.entity.Member;
import com.example.shop.member.dto.MemberCreateRequest;
import com.example.shop.member.dto.MemberUpdateRequest;
import com.example.shop.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MemberService {
    public Long createMember(MemberCreateRequest memberCreateRequest);
    public Member getMemberById(Long id);
    public void updateMember(Long id, MemberUpdateRequest memberUpdateRequest);
    public void deleteMember(Long id);
    public List<Member> getAllMembers();
}

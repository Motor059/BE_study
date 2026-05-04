package com.example.shop.order.dto;

import lombok.Getter;

@Getter
public class OrderCreateRequest {
    private Long memberId;
    private Long productId;
    private int quantity;
}
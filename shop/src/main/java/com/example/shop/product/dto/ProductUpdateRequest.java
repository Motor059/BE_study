package com.example.shop.product.dto;

import lombok.Getter;

@Getter
public class ProductUpdateRequest {
    private String name;
    private int price;
    private int stock;
}
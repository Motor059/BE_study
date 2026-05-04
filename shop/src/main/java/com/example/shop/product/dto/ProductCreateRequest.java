package com.example.shop.product.dto;

import lombok.Getter;

@Getter
public class ProductCreateRequest {
    private String name;
    private int price;
    private int stock;
}
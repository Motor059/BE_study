package com.example.shop.product.dto;

import com.example.shop.common.message.ErrorMessage;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class ProductUpdateRequest {

    @NotBlank(message = ErrorMessage.PRODUCT_NAME_NOT_BLANK)
    private String name;

    @Min(value = 0, message = ErrorMessage.PRODUCT_PRICE_MIN)
    private int price;

    @Min(value = 0, message = ErrorMessage.PRODUCT_STOCK_MIN)
    private int stock;

    public ProductUpdateRequest(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
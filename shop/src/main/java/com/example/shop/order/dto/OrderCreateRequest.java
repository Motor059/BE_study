package com.example.shop.order.dto;

import com.example.shop.common.message.ErrorMessage;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class OrderCreateRequest {

    @NotNull(message = ErrorMessage.ORDER_MEMBER_NOT_NULL)
    private Long memberId;

    @NotNull(message = ErrorMessage.ORDER_PRODUCT_NOT_NULL)
    private Long productId;

    @Min(value = 1, message = ErrorMessage.ORDER_QUANTITY_MIN)
    private int quantity;

    public OrderCreateRequest(Long memberId, Long productId, int quantity) {
        this.memberId = memberId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
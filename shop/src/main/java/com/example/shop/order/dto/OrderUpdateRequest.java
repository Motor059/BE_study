package com.example.shop.order.dto;

import com.example.shop.common.message.ErrorMessage;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class OrderUpdateRequest {

    @Min(value = 1, message = ErrorMessage.ORDER_QUANTITY_MIN)
    private int quantity;

    @NotBlank(message = ErrorMessage.ORDER_STATUS_NOT_BLANK)
    private String status;

    public OrderUpdateRequest(int quantity, String status) {
        this.quantity = quantity;
        this.status = status;
    }
}
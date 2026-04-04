package com.example.shop.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    // 구체적인 논리 작성은 다음에,,
    public Long createOrder(OrderCreateRequest request) {
        return 1L;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>();
    }

    public Order getOrderById(Long id) {
        return new Order();
    }

    public void cancelOrder(Long id) {
    }
}
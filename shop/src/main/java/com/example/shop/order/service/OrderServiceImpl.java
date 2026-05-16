package com.example.shop.order.service;

import com.example.shop.order.dto.OrderCreateRequest;
import com.example.shop.order.entity.Order;
import com.example.shop.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Long createOrder(OrderCreateRequest request) {
        return 1L;
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>();
    }

    @Override
    public Order getOrderById(Long id) {
        return new Order();
    }

    @Override
    public void cancelOrder(Long id) {
    }
}
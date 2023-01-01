package com.semestral.eshop.service;

import com.semestral.eshop.domain.Order;
import com.semestral.eshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    private OrderRepository orderRepository;
    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @Override
    public Order create(Order toAdd) {
        return null;
    }

    @Override
    public Order update(Order toUpdate) {
        return null;
    }

    @Override
    public Order delete(Order toDelete) {
        return null;
    }

    @Override
    public Order findById(Long toFind) {
        return null;
    }

}

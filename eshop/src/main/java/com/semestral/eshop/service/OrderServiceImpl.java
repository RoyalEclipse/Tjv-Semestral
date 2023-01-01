package com.semestral.eshop.service;

import com.semestral.eshop.domain.Order;
import com.semestral.eshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;
    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @Override
    public Order create(Order toAdd) {
        return orderRepository.save(toAdd);
    }

    @Override
    public Order update(Order toUpdate) {
        return orderRepository.save(toUpdate);
    }

    @Override
    public void delete(Long toDelete) {
        orderRepository.deleteById(toDelete);
    }

    @Override
    public Optional<Order> findById(Long toFind) {
        return orderRepository.findById(toFind);
    }

}

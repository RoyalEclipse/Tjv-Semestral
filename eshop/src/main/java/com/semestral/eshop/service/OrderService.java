package com.semestral.eshop.service;

import com.semestral.eshop.domain.Order;

import java.util.Optional;

public interface OrderService {
    Order create(Order toAdd);
    Order update(Order toUpdate);
    void delete(Long toDelete);
    Optional<Order> findById(Long toFind );
}

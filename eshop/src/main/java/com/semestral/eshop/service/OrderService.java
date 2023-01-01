package com.semestral.eshop.service;

import com.semestral.eshop.domain.Order;

public interface OrderService {
    Order create(Order toAdd);
    Order update(Order toUpdate);
    Order delete(Order toDelete);
    Order findById(Long toFind );
}

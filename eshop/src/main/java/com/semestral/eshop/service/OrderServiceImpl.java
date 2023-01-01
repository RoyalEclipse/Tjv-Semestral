package com.semestral.eshop.service;

import com.semestral.eshop.domain.SiteOrder;
import com.semestral.eshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;
    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @Override
    public SiteOrder create(SiteOrder toAdd) {
        return orderRepository.save(toAdd);
    }

    @Override
    public SiteOrder update(SiteOrder toUpdate) {
        return orderRepository.save(toUpdate);
    }

    @Override
    public void delete(Long toDelete) {
        orderRepository.deleteById(toDelete);
    }

    @Override
    public Optional<SiteOrder> findById(Long toFind) {
        return orderRepository.findById(toFind);
    }

    @Override
    public List<SiteOrder> findAll() {
        return orderRepository.findAll();
    }
}

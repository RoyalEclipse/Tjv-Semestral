package com.semestral.eshop.service;

import com.semestral.eshop.domain.SiteOrder;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    SiteOrder create(SiteOrder toAdd);
    SiteOrder update(SiteOrder toUpdate);
    void delete(Long toDelete);
    Optional<SiteOrder> findById(Long toFind );
    List<SiteOrder> findAll();
}

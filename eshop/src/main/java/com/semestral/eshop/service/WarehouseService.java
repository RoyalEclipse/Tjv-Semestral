package com.semestral.eshop.service;

import com.semestral.eshop.domain.Warehouse;

public interface WarehouseService {
    Warehouse create(Warehouse toAdd);
    Warehouse update(Warehouse toUpdate);
    Warehouse delete(Warehouse toDelete);
    Warehouse findById(Long toFind );
}

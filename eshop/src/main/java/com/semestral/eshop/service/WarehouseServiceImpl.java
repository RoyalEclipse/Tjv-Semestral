package com.semestral.eshop.service;

import com.semestral.eshop.domain.Warehouse;
import com.semestral.eshop.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseServiceImpl implements WarehouseService{

    private WarehouseRepository warehouseRepository;
    @Autowired
    public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public Warehouse create(Warehouse toAdd) {
        return null;
    }

    @Override
    public Warehouse update(Warehouse toUpdate) {
        return null;
    }

    @Override
    public Warehouse delete(Warehouse toDelete) {
        return null;
    }

    @Override
    public Warehouse findById(Long toFind) {
        return null;
    }
}

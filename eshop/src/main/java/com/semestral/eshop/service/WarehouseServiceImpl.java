package com.semestral.eshop.service;

import com.semestral.eshop.domain.Warehouse;
import com.semestral.eshop.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WarehouseServiceImpl implements WarehouseService{

    private final WarehouseRepository warehouseRepository;
    @Autowired
    public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public Warehouse create(Warehouse toAdd) {
        return warehouseRepository.save(toAdd);
    }

    @Override
    public Warehouse update(Warehouse toUpdate) {
        return warehouseRepository.save(toUpdate);
    }

    @Override
    public void delete (Long toDelete) {
        warehouseRepository.deleteById(toDelete);
    }

    @Override
    public Optional<Warehouse> findById(Long toFind) {
        return warehouseRepository.findById(toFind);
    }
}

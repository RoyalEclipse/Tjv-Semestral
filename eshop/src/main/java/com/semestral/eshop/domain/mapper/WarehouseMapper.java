package com.semestral.eshop.domain.mapper;

import com.semestral.eshop.domain.Warehouse;
import com.semestral.eshop.domain.dto.WarehouseDto;

public class WarehouseMapper {
    WarehouseDto toDto(Warehouse warehouse){
        WarehouseDto temp = new WarehouseDto();
        temp.setId(warehouse.getId());
        temp.setCoordinates(warehouse.getCoordinates());
        temp.setAvailableProducts(warehouse.getAvailableProducts());
        return temp;
    }
    Warehouse fromDto(WarehouseDto warehouseDto){
        Warehouse temp = new Warehouse();
        temp.setAvailableProducts(warehouseDto.getAvailableProducts());
        temp.setId(warehouseDto.getId());
        temp.setCoordinates(warehouseDto.getCoordinates());
        return temp;
    }
}

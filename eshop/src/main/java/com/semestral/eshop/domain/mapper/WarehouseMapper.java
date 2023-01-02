package com.semestral.eshop.domain.mapper;

import com.semestral.eshop.domain.Warehouse;
import com.semestral.eshop.domain.dto.WarehouseDto;
import org.springframework.stereotype.Component;

@Component
public class WarehouseMapper {
    public WarehouseDto toDto(Warehouse warehouse){
        WarehouseDto temp = new WarehouseDto();
        temp.setId(warehouse.getId());
        temp.setCoordinates(warehouse.getCoordinates());
        temp.setAvailableProducts(warehouse.getAvailableProducts());
        return temp;
    }
    public Warehouse fromDto(WarehouseDto warehouseDto){
        Warehouse temp = new Warehouse();
        temp.setAvailableProducts(warehouseDto.getAvailableProducts());
        temp.setId(warehouseDto.getId());
        temp.setCoordinates(warehouseDto.getCoordinates());
        return temp;
    }
}

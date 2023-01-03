package com.semestral.eshop.domain.mapper;

import com.semestral.eshop.domain.Product;
import com.semestral.eshop.domain.Warehouse;
import com.semestral.eshop.domain.dto.ProductDto;
import com.semestral.eshop.repository.WarehouseRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class ProductMapper {
    private final WarehouseRepository warehouseRepository;

    public ProductMapper(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public ProductDto toDto(Product product){
        ProductDto temp = new ProductDto();
        temp.setDescription(product.getDescription());
        temp.setId(product.getId());
        temp.setName(product.getName());

        List<Long> availableAtId = new ArrayList<>();
        for( Warehouse warehouse : product.getAvailableAt() ){
            availableAtId.add( warehouse.getId() );
        }
        temp.setAvailableAt(availableAtId);

        temp.setPrice(product.getPrice());
        temp.setImageUrl(product.getImageUrl());
        temp.setFromSiteOrder(product.getFromOrder());
        return temp;
    }
    public Product fromDto(ProductDto productDto){
        Product temp = new Product();
        temp.setDescription(productDto.getDescription());
        temp.setId(productDto.getId());
        temp.setName(productDto.getName());

        List<Warehouse> availableAtWar = new ArrayList<>();
        for( Long warehouseId : productDto.getAvailableAt() ){
            Optional<Warehouse> foundWar = warehouseRepository.findById(warehouseId);
            if(foundWar.isPresent()){
                availableAtWar.add(foundWar.get());
            }
            else{
                throw new NoSuchElementException("No such warehouse found.");
            }
        }

        temp.setAvailableAt(availableAtWar);
        temp.setPrice(productDto.getPrice());
        temp.setImageUrl(productDto.getImageUrl());
        temp.setFromOrder(productDto.getFromSiteOrder());
        return temp;
    }
}
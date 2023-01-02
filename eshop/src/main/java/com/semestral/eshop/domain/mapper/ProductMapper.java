package com.semestral.eshop.domain.mapper;

import com.semestral.eshop.domain.Product;
import com.semestral.eshop.domain.dto.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductDto toDto(Product product){
        ProductDto temp = new ProductDto();
        temp.setDescription(product.getDescription());
        temp.setId(product.getId());
        temp.setName(product.getName());
        temp.setAvailableAt(product.getAvailableAt());
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
        temp.setAvailableAt(productDto.getAvailableAt());
        temp.setPrice(productDto.getPrice());
        temp.setImageUrl(productDto.getImageUrl());
        temp.setFromOrder(productDto.getFromSiteOrder());
        return temp;
    }
}
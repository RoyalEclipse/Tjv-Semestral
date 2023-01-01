package com.semestral.eshop.domain.dto;

import com.semestral.eshop.domain.Product;

import java.util.Set;

public class WarehouseDto {
    private Long id;
    private String coordinates;
    private Set<Product> availableProducts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Set<Product> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(Set<Product> availableProducts) {
        this.availableProducts = availableProducts;
    }
}
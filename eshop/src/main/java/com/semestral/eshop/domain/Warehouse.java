package com.semestral.eshop.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Warehouse {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String coordinates;

    @ManyToMany
    private Set<Product> availableProducts;

    public Warehouse() {
    }

    public Warehouse(String coordinates, Set<Product> availableProducts) {
        this.coordinates = coordinates;
        this.availableProducts = availableProducts;
    }

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


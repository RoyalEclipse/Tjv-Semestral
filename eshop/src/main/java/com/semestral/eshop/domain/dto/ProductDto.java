package com.semestral.eshop.domain.dto;

import com.semestral.eshop.domain.SiteOrder;
import com.semestral.eshop.domain.Warehouse;

import java.util.Set;

public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private int price;
    private SiteOrder fromSiteOrder;
    private Set<Warehouse> availableAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SiteOrder getFromSiteOrder() {
        return fromSiteOrder;
    }

    public void setFromSiteOrder(SiteOrder fromSiteOrder) {
        this.fromSiteOrder = fromSiteOrder;
    }

    public Set<Warehouse> getAvailableAt() {
        return availableAt;
    }

    public void setAvailableAt(Set<Warehouse> availableAt) {
        this.availableAt = availableAt;
    }
}
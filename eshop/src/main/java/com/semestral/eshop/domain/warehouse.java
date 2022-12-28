package com.semestral.eshop.domain;

@Entity
public class warehouse {

    private @id;
    @GeneratedValue Long id;

    @NotBlank
    private String coordinates;

    @ManyToMany
    private Set<product> availableProducts;

    public warehouse(String coordinates, Set<product> availableProducts) {
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

    public Set<product> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(Set<product> availableProducts) {
        this.availableProducts = availableProducts;
    }
}


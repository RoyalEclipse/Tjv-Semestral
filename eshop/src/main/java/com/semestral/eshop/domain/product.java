package com.semestral.eshop.domain;

@Entity
public class product {
    private @id;
    @GeneratedValue Long id;

    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private String imageUrl;
    @NotBlank
    private int price;
    @ManyToOne
    private order fromOrder;

    @ManyToMany
    private Set<warehouse> availableAt;

    public order getFromOrder() {
        return fromOrder;
    }

    public void setFromOrder(order fromOrder) {
        this.fromOrder = fromOrder;
    }

    public Set<warehouse> getAvailableAt() {
        return availableAt;
    }

    public void setAvailableAt(Set<warehouse> availableAt) {
        this.availableAt = availableAt;
    }

    public product(String name, String description, String imageUrl, int price, order fromOrder, Set<warehouse> availableAt) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.fromOrder = fromOrder;
        this.availableAt = availableAt;
    }

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
}
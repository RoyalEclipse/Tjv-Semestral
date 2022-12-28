package com.semestral.eshop.domain;

@Entity
public class order {
    private @id;
    @GeneratedValue Long id;
    @NotBlank
    private String dateCreated;
    @NotBlank
    private String deliverTo;
    @NotBlank
    private int eta;

    @ManyToOne
    private user fromUser;

    @OneToMany(mappedBy = "order")
    private List<product> products;

    public order(String dateCreated, String deliverTo, int eta, user fromUser, List<product> products) {
        this.dateCreated = dateCreated;
        this.deliverTo = deliverTo;
        this.eta = eta;
        this.fromUser = fromUser;
        this.products = products;
    }

    public List<product> getProducts() {
        return products;
    }

    public void setProducts(List<product> products) {
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(String deliverTo) {
        this.deliverTo = deliverTo;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public user getFromUser() {
        return fromUser;
    }

    public void setFromUser(user fromUser) {
        this.fromUser = fromUser;
    }
}
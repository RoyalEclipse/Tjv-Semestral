package com.semestral.eshop.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class SiteUser {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String surname;
    @Column(nullable=false)
    private String email;
    @Column(nullable=false)
    private String phoneNumber;
    @Column(nullable=false)
    private int accessPrivileges;
    @Column(nullable=false)
    private long credits;

    @OneToMany(mappedBy = "user")
    private List<Order> Orders;

    public SiteUser() {
    }

    public SiteUser(String name, String surname, String email, String phoneNumber, int accessPrivileges, long credits, List<Order> Orders) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accessPrivileges = accessPrivileges;
        this.credits = credits;
        this.Orders = Orders;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccessPrivileges() {
        return accessPrivileges;
    }

    public void setAccessPrivileges(int accessPrivileges) {
        this.accessPrivileges = accessPrivileges;
    }

    public long getCredits() {
        return credits;
    }

    public void setCredits(long credits) {
        this.credits = credits;
    }

    public List<Order> getOrders() {
        return Orders;
    }

    public void setOrders(List<Order> Orders) {
        this.Orders = Orders;
    }
}
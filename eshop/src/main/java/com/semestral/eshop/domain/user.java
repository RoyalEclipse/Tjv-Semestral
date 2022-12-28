package com.semestral.eshop.domain;

@Entity
public class user {
    private @id
    @GeneratedValue Long id;

    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    private String email;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private int accessPrivileges;
    @NotBlank
    private long credits;

    @OneToMany(mappedBy = "user")
    private List<order> orders;

    public user(String name, String surname, String email, String phoneNumber, int accessPrivileges, long credits, List<order> orders) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accessPrivileges = accessPrivileges;
        this.credits = credits;
        this.orders = orders;
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

    public List<order> getOrders() {
        return orders;
    }

    public void setOrders(List<order> orders) {
        this.orders = orders;
    }
}
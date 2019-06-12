package com.sda.tallinn4.practicalproject.register.model;

import javax.persistence.*;

@Entity
public class Company {

    @Id
    private Long id;
    private String companyName;
    private String regNumber;
    private String Street;
    private String City;
    private Integer postIndex;

    @OneToOne
    @MapsId
    private User user;

    public Company() {
    }

    public Company(String companyName, String regNumber, String street, String city, Integer postIndex, User user) {

        this.companyName = companyName;
        this.regNumber = regNumber;
        Street = street;
        City = city;
        this.postIndex = postIndex;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Integer getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(Integer postIndex) {
        this.postIndex = postIndex;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

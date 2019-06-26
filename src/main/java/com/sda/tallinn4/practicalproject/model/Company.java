package com.sda.tallinn4.practicalproject.model;



import javax.persistence.*;


@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String regNumber;
    private String street;
    private String city;
    private Integer postIndex;

    @OneToOne
    @JoinColumn(name = "user_name")
    private User user;


    public Company() {
    }

    public Company(String companyName, String regNumber, String street, String city, Integer postIndex, User user) {
        this.companyName = companyName;
        this.regNumber = regNumber;
        this.street = street;
        this.city = city;
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
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

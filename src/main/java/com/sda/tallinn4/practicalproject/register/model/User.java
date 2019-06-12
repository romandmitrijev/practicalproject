package com.sda.tallinn4.practicalproject.register.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String userType;

    @OneToOne(mappedBy = "user")
    private UserDetails userDetails;

    @OneToOne(mappedBy = "user")
    private Company company;

    public User() {
    }

    public User(String username, String userType, UserDetails userDetails, Company company) {
        this.username = username;
        this.userType = userType;
        this.userDetails = userDetails;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

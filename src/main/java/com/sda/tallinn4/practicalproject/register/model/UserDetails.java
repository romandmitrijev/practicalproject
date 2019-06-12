package com.sda.tallinn4.practicalproject.register.model;

import javax.persistence.*;

@Entity
public class UserDetails {

    @Id
    private Long id;
    private String firstName;
    private String lastNamae;
    private String email;
    private Integer phoneNumber;

    @OneToOne
    @MapsId
    private User user;

    public UserDetails() {
    }

    public UserDetails(String firstName, String lastNamae, String email, Integer phoneNumber, User user) {
        this.firstName = firstName;
        this.lastNamae = lastNamae;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamae() {
        return lastNamae;
    }

    public void setLastNamae(String lastNamae) {
        this.lastNamae = lastNamae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}



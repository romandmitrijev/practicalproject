package com.sda.tallinn4.practicalproject.register.model;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {

    @Id
    private String userName;
    private String password;
    private String email;
    private String userType;

   /* @OneToOne(mappedBy = "user")
    private UserDetails userDetails;

    @OneToOne(mappedBy = "user")
    private Company company;*/

    public User() {
    }

    public User(String userName, String password, String email, String userType) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userType = userType;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
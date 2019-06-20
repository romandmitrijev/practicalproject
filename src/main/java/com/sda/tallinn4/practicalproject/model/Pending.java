package com.sda.tallinn4.practicalproject.model;

import com.sda.tallinn4.practicalproject.register.model.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pending {

    @Id
    private Integer id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Cargo cargo;

    @ManyToOne
    private Vehicle vehicle;

    private String comments;
}

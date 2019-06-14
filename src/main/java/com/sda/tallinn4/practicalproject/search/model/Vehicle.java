package com.sda.tallinn4.practicalproject.search.model;


import com.sda.tallinn4.practicalproject.register.model.User;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private Integer capacity;

    @Column(name = "loading_place")
    private String loadingPlace;

    @Column(name = "delivery_place")
    private String deliveryPlace;


}
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

    @Column(name = "location")
    private String vehicleLocation;

    @Column(name = "possible_delivery_areas")
    private String deliveryArea;

    private String status;


}
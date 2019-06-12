package com.sda.tallinn4.practicalproject.search.model;


import com.sda.tallinn4.practicalproject.search.User;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;



}


/*
    CREATE TABLE vehicle(
        id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
        user_id LONG NOT NULL,
        capacity VARCHAR(20),
    loading_place VARCHAR(20),
    delivery_place VARCHAR(20)
);*/

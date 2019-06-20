package com.sda.tallinn4.practicalproject.model;

import com.sda.tallinn4.practicalproject.register.model.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Shipment {

    @Id
    private Long id;

    @OneToOne
    private User user;

    @OneToOne
    private Cargo cargo;

    @OneToOne
    private Vehicle vehicle;

}

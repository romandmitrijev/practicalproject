package com.sda.tallinn4.practicalproject.search.model;


import com.sda.tallinn4.practicalproject.search.User;

import javax.persistence.*;

@Entity
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Column(name = "cargo_description")
    private String description;

    private Integer cargowWeight;

    @Column(name = "cargo_size")
    private String cargoSize;
}
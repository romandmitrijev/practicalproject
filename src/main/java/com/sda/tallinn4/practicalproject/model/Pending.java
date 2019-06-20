package com.sda.tallinn4.practicalproject.model;



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

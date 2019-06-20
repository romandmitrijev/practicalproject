package com.sda.tallinn4.practicalproject.model;


import javax.persistence.*;

@Entity
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;

    @Column(name = "cargo_description")
    private String cargoDescription;

    @Column(name = "loading_place")
    private String loadingPlace;

    @Column(name = "discharging_place")
    private String dischargingPlace;

    @Column(name = "cargo_weight")
    private Integer cargoWeight;

    @Column(name = "custom_status")
    private String customStatus;

    public Cargo() {
    }

    public Cargo(User user, String cargoDescription, String loadingPlace, String dischargingPlace, Integer cargoWeight, String customStatus) {
        this.user = user;
        this.cargoDescription = cargoDescription;
        this.loadingPlace = loadingPlace;
        this.dischargingPlace = dischargingPlace;
        this.cargoWeight = cargoWeight;
        this.customStatus = customStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCargoDescription() {
        return cargoDescription;
    }

    public void setCargoDescription(String cargoDescription) {
        this.cargoDescription = cargoDescription;
    }

    public String getLoadingPlace() {
        return loadingPlace;
    }

    public void setLoadingPlace(String loadingPlace) {
        this.loadingPlace = loadingPlace;
    }

    public String getDischargingPlace() {
        return dischargingPlace;
    }

    public void setDischargingPlace(String dischargingPlace) {
        this.dischargingPlace = dischargingPlace;
    }

    public Integer getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Integer cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getCustomStatus() {
        return customStatus;
    }

    public void setCustomStatus(String customStatus) {
        this.customStatus = customStatus;
    }
}
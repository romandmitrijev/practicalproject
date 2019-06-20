package com.sda.tallinn4.practicalproject.model;




import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;

    private Integer capacity;

    @Column(name = "location")
    private String vehicleLocation;

    @Column(name = "possible_delivery_areas")
    private String deliveryArea;

    private String status;

    public Vehicle() {
    }

    public Vehicle(User user, Integer capacity, String vehicleLocation, String deliveryArea, String status) {
        this.user = user;
        this.capacity = capacity;
        this.vehicleLocation = vehicleLocation;
        this.deliveryArea = deliveryArea;
        this.status = status;
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getVehicleLocation() {
        return vehicleLocation;
    }

    public void setVehicleLocation(String vehicleLocation) {
        this.vehicleLocation = vehicleLocation;
    }

    public String getDeliveryArea() {
        return deliveryArea;
    }

    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
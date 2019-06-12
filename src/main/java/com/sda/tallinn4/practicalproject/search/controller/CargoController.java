package com.sda.tallinn4.practicalproject.search.controller;

public class CargoController {
    private static CargoController ourInstance = new CargoController();

    public static CargoController getInstance() {
        return ourInstance;
    }

    private CargoController() {
    }
}

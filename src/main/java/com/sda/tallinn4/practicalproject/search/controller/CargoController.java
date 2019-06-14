package com.sda.tallinn4.practicalproject.search.controller;

import com.sda.tallinn4.practicalproject.search.model.Cargo;
import com.sda.tallinn4.practicalproject.search.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargoController {

    @Autowired
    CargoRepository cargoRepository;

    @GetMapping(path = "cargo/all")
    public Iterable<Cargo> getAll (){
        return cargoRepository.findAll();
    }



}

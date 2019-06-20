package com.sda.tallinn4.practicalproject.controller;

import com.sda.tallinn4.practicalproject.model.Cargo;
import com.sda.tallinn4.practicalproject.repository.CargoRepository;
import com.sda.tallinn4.practicalproject.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CargoController {

    @Autowired
    CargoRepository cargoRepository;

    @Autowired
    CargoService cargoService;

    @GetMapping(path = "cargo/all")
    public Iterable<Cargo> findAll (){
        return cargoService.findAll();
    }

    @GetMapping(path = "cargo/findByLoadingPlace")
    public Iterable<Cargo> findAllByLoadingPlace (@RequestParam("loadingPlace") String name){
        return cargoService.findAllByLoadingPlace(name);
    }

    @GetMapping(path = "cargo/findByDischargingPlace")
    public Iterable<Cargo> findAllByDischargingPlace (@RequestParam("dischargingPlace") String name){
        return cargoService.findAllByDischargingPlace(name);
    }

    @GetMapping(path = "cargo/findAllByCargoDescription/")
    public Iterable<Cargo> findAllByCargoDescription (@RequestParam("cargoDescription") String name){
        return cargoService.findAllByCargoDescription(name);
    }

    @GetMapping(path = "/cargo/add")
    public void get(Model model){
        Cargo cargo = new Cargo();
        model.addAttribute("cargo", cargo);
    }

    @PostMapping(path = "/cargo/add")
    public String addNewCargo(Model model, @RequestBody Cargo cargo){// @ModelAttribute("cargo")
        cargoService.addNewCargo(cargo);
        return "addcargo";
    }

    @DeleteMapping(path = "/cargo/delete")
    public void deleteCargo (@RequestBody Cargo cargo){
        cargoService.deleteCargo(cargo);
    }

}

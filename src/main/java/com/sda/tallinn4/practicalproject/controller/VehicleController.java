package com.sda.tallinn4.practicalproject.controller;

import com.sda.tallinn4.practicalproject.model.Vehicle;
import com.sda.tallinn4.practicalproject.repository.VehicleRepository;
import com.sda.tallinn4.practicalproject.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    VehicleService vehicleService;

    @GetMapping(path = "vehicle/all")
    public Iterable<Vehicle> findAll(){
        return vehicleService.findAll();
    }

    @GetMapping(path = "vehicle/findByLocation")
    public List<Vehicle> findAllByVehicleLocation (@RequestParam("location") String name){
        return vehicleRepository.findAllByVehicleLocation(name);
    }
    @GetMapping(path ="vehicle/findByCapacity")
    public List<Vehicle> findAllByCapacity (@RequestParam("capacity") Integer size){
        return vehicleRepository.findAllByCapacity(size);
    }
    @GetMapping(path = "vehicle/findByDeliveryArea")
    public List<Vehicle> findAllByDeliveryArea (@RequestParam("deliveryArea") String area){
        return vehicleRepository.findAllByDeliveryArea(area);
    }
    public void deleteVehicle (Vehicle vehicle){
        vehicleRepository.delete(vehicle);
    }

    @GetMapping(path = "vehicle/add")
    public void get(Model model){
        Vehicle vehicle = new Vehicle();
        model.addAttribute("vehicle", vehicle);
    }

    @PostMapping(path = "vehicle/add")
    public String addNewVehicle(Model model, @RequestBody Vehicle vehicle){ //@ModelAttribute("vehicle") for frontend
        vehicleService.addNewVehicle(vehicle);
        return "addvehicle";
    }

}
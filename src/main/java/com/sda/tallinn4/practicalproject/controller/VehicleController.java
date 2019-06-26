package com.sda.tallinn4.practicalproject.controller;

import com.sda.tallinn4.practicalproject.model.Vehicle;
import com.sda.tallinn4.practicalproject.repository.VehicleRepository;
import com.sda.tallinn4.practicalproject.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    VehicleService vehicleService;

/*
    @GetMapping(path = "vehicle/all")
    public Iterable<Vehicle> findAll(){
        return vehicleService.findAll();
    }
*/

    @GetMapping(path = "vehicle")
    public ModelAndView findAllVehicle() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/vehicle");
        modelAndView.addObject("vehicles", vehicleService.findAll());
        return modelAndView;
    }
    @GetMapping(path = "vehicle/findBySearchCriteria")
    public ModelAndView findBySearchCriteria (@RequestParam String name,@RequestParam String criteria){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/vehicle");
        modelAndView.addObject("vehicles", vehicleService.findAllBySearchCriteria(name, criteria));
        return modelAndView;
    }

    @GetMapping(path = "vehicle/findAllByUser")
    public Iterable<Vehicle> findAllByUser (@RequestParam("User") String name){
        return vehicleService.findAllByUser(name);
    }

    @GetMapping(path = "vehicle/findByLocation")
    public Iterable<Vehicle> findAllByVehicleLocation (@RequestParam("vehicleLocation") String name){
        return vehicleService.findAllByVehicleLocation(name);
    }
    @GetMapping(path ="vehicle/findByCapacity")
    public List<Vehicle> findAllByCapacity (@RequestParam("capacity") Integer capacity){
        return vehicleService.findAllByCapacity(capacity);
    }
    @GetMapping(path = "vehicle/findByDeliveryArea")
    public List<Vehicle> findAllByDeliveryArea (@RequestParam("deliveryArea") String name){
        return vehicleService.findAllByDeliveryArea(name);
    }

    @GetMapping(path = "vehicle/add")
    public void get(Model model){
        Vehicle vehicle = new Vehicle();
        model.addAttribute("vehicle", vehicle);
    }

    @PostMapping(path = "vehicle/add")
    public String addNewVehicle(@RequestBody Vehicle vehicle){ //@ModelAttribute("vehicle") for frontend
        vehicleService.addNewVehicle(vehicle);
        return "addvehicle";
    }

}
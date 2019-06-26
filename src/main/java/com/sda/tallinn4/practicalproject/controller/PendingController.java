package com.sda.tallinn4.practicalproject.controller;

import com.sda.tallinn4.practicalproject.model.Pending;
import com.sda.tallinn4.practicalproject.model.Vehicle;
import com.sda.tallinn4.practicalproject.repository.CargoRepository;
import com.sda.tallinn4.practicalproject.repository.PendingRepository;
import com.sda.tallinn4.practicalproject.repository.VehicleRepository;
import com.sda.tallinn4.practicalproject.service.PendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PendingController {
    @Autowired
    PendingService pendingService;
    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    CargoRepository cargoRepository;

    @Autowired
    PendingRepository pendingRepository;

    @GetMapping(path = "pending")
    public ModelAndView findAllPending() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/pending");
        modelAndView.addObject("pending", pendingService.findAll());
        return modelAndView;
    }


/*    @GetMapping(path = "/pending/add")
    public String get(Model model){
        Pending pending = new Pending();
        model.addAttribute("pending", pending);
        return "html/addpending";
    }*/

    @PostMapping(path = "/pending/add")
    public String addNewCargo(@ModelAttribute("pending") Pending pending){
        pendingService.addNewPending(pending);
        return "html/addpending";
    }
}

package com.sda.tallinn4.practicalproject.controller;

import com.sda.tallinn4.practicalproject.model.UserDetails;
import com.sda.tallinn4.practicalproject.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserDetailsController {

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping(path = "/userdetails/add")
    public void get(Model model){
        UserDetails userDetails = new UserDetails();
        model.addAttribute("userdetails", userDetails);
    }

//    @PostMapping(path = "/userdetails/add")
//    public void addUserdetails(Model model, @ModelAttribute("userdetails") UserDetails userDetails){
//        userDetailsService.addUserDetails(userDetails);
//    }

    @PostMapping(path = "/userdetails/add")
    public void addUserDetails(@RequestBody UserDetails userDetails){
        userDetailsService.addUserDetails(userDetails);
    }
}

package com.sda.tallinn4.practicalproject.controller;

import com.sda.tallinn4.practicalproject.model.User;
import com.sda.tallinn4.practicalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/register")
    public void get(Model model){
        User user = new User();
        model.addAttribute("user", user);
    }

//    @PostMapping(path = "/register")
//    public void registerUser(Model model, @ModelAttribute("user") User user){
//        userService.addUser(user);
//    }

    @PostMapping(path = "/register")
    public void registerUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping(path = "/{userName}")
    public User findUserByUserName(@PathVariable String userName){
        return userService.getUser(userName);
    }

    @GetMapping(path = "/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
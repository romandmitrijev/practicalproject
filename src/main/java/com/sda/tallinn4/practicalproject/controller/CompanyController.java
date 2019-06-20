package com.sda.tallinn4.practicalproject.controller;

import com.sda.tallinn4.practicalproject.model.Company;
import com.sda.tallinn4.practicalproject.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CompanyController {

    @Autowired
    CompanyService companyService;


    @GetMapping(path = "/company/add")
    public void get(Model model){
        Company company = new Company();
        model.addAttribute("company", company);
    }

//    @PostMapping(path = "/company/add")
//    public void addCargo(Model model, @ModelAttribute ("company") Company company){
//        companyService.addCompany(company);
//    }

    @PostMapping(path = "/company/add")
    public void addCargo(@RequestBody Company company){
        companyService.addCompany(company);
    }
}

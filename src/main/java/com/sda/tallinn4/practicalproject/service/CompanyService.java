package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.model.Company;
import com.sda.tallinn4.practicalproject.model.User;
import com.sda.tallinn4.practicalproject.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public void addCompany(Company company){
        companyRepository.save(company);
    }

}

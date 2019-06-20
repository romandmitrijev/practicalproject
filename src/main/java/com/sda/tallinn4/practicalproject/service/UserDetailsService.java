package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.model.UserDetails;
import com.sda.tallinn4.practicalproject.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void addUserDetails(UserDetails userDetails){
        userDetailsRepository.save(userDetails);
    }
}

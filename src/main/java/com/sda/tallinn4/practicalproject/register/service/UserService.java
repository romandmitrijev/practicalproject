package com.sda.tallinn4.practicalproject.register.service;

import com.sda.tallinn4.practicalproject.register.model.User;
import com.sda.tallinn4.practicalproject.register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        if(user.getUserType() == null) {
            user.setUserType("user");
        }
        if (userRepository.existsById(user.getUserName())){
            System.out.println("This username is already taken");
        }
        userRepository.save(user);
    }

    public User getUser(String userName){
        if (!userRepository.existsById(userName)){
            System.out.println("User " + userName + " does not exist");
        }
        return userRepository.findUserByUserName(userName);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }



}

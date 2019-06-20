package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.exception.UserNameAlreadyTakenException;
import com.sda.tallinn4.practicalproject.exception.UserNotFoundException;
import com.sda.tallinn4.practicalproject.model.User;
import com.sda.tallinn4.practicalproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        if(user.getUserType() == null) {
            user.setUserType("user");
        }
        if (userRepository.existsById(user.getUserName())){
            throw new UserNameAlreadyTakenException("This username is already taken");
        }
        userRepository.save(user);
    }

    public User getUser(String userName){
        Optional<User> optionalUser = userRepository.findById(userName);
        if(optionalUser.isPresent()) {
            return optionalUser.get();
        }
        throw new UserNotFoundException("User " + userName + " does not exist");

    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }



}

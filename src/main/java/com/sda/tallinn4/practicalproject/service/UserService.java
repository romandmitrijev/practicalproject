package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.exception.UserNameAlreadyTakenException;
import com.sda.tallinn4.practicalproject.exception.UserNotFoundException;
import com.sda.tallinn4.practicalproject.model.User;
import com.sda.tallinn4.practicalproject.model.UserDetails;
import com.sda.tallinn4.practicalproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        if(user.getUserType() == null) {
            user.setUserType("user");
        }
        UserDetails userDetails = new UserDetails();
        userDetails.setUser(user);
        user.setUserDetails(userDetails);
        if (userRepository.existsById(user.getUserName())){
            throw new UserNameAlreadyTakenException(user, "This username is already taken");
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

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findById(username);
        if (!optionalUser.isPresent()){
            throw new UsernameNotFoundException(username);
        }
        User user = optionalUser.get();
        return new org.springframework.security.core.userdetails.User(
                user.getUserName(), user.getPassword(), Arrays.asList(new SimpleGrantedAuthority(user.getUserType())));
    }

}

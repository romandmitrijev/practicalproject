package com.sda.tallinn4.practicalproject.util;

import com.sda.tallinn4.practicalproject.model.User;
import com.sda.tallinn4.practicalproject.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtil {
        public static User getLoggedInUser(UserService userService) {
            org.springframework.security.core.userdetails.User springUser =
                    (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return userService.findUserByUserName(springUser.getUsername());
        }
    }

package com.sda.tallinn4.practicalproject.controlleradvice;

import com.sda.tallinn4.practicalproject.exception.UserNameAlreadyTakenException;
import com.sda.tallinn4.practicalproject.model.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorControllerAdvice {

    @ExceptionHandler(UserNameAlreadyTakenException.class)
    public ModelAndView handleUserNameAlreadyTakenException(UserNameAlreadyTakenException ex) {
        ModelAndView modelAndView = new ModelAndView();
        User user = ex.getUser();
        modelAndView.addObject("error", ex.getMessage());
        modelAndView.addObject("user", user);
        modelAndView.setViewName("/html/register");
        return  modelAndView;
    }
}

package com.sda.tallinn4.practicalproject.exception;

public class UserNotFoundException extends  RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}

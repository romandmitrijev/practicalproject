package com.sda.tallinn4.practicalproject.exception;

public class UserNameAlreadyTakenException extends RuntimeException {

    public UserNameAlreadyTakenException(String message) {
        super(message);
    }
}

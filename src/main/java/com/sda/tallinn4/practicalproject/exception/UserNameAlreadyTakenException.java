package com.sda.tallinn4.practicalproject.exception;

import com.sda.tallinn4.practicalproject.model.User;

public class UserNameAlreadyTakenException extends RuntimeException {

    private User user;

    public UserNameAlreadyTakenException(User user, String message) {
        super(message);
        this.user = user;
    }

    public User getUser() {
    return user;
}

    public void setUser(User user) {
        this.user = user;
    }
}

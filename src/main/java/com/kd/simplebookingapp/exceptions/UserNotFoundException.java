package com.kd.simplebookingapp.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}

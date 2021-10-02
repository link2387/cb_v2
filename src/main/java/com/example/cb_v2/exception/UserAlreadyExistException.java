package com.example.cb_v2.exception;

public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException() {
    }

    public UserAlreadyExistException(String message) {
        super(message);
    }

}

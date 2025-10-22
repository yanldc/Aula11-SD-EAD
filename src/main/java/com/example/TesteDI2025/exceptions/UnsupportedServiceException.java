package com.example.TesteDI2025.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedServiceException extends RuntimeException {
    
    public UnsupportedServiceException(String message) {
        super(message);
    }
}
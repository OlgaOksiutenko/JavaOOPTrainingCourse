package com.tyshchenko.training.java.oop.lesson3.exceptions;

/**
 * Created by ol on 26.05.2015.
 */
public class WrongFormatURLException extends RuntimeException {

    public WrongFormatURLException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "WrongFormatURLException: " + super.getMessage();
    }
}

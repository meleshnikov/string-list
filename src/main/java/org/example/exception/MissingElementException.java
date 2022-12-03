package org.example.exception;

public class MissingElementException extends IllegalArgumentException{

    public MissingElementException(String message) {
        super(message);
    }
}

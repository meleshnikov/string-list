package org.example.exception;

public class MissingStringException extends IllegalArgumentException {
    public MissingStringException(String s) {
        super(s);
    }
}

package com.project.seikai.exceptions;

public class AlreadyExistsException extends  RuntimeException{
    public AlreadyExistsException(String message) {
        super(message);
    }
}

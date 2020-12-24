package com.axis.idm.exception;

public class IdmException extends Throwable {
    public String message;


    public IdmException(String message, String errorMessage) {
        super(message);
        this.message = errorMessage;
    }
}

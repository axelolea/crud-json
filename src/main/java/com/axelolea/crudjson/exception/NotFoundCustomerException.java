package com.axelolea.crudjson.exception;

public class NotFoundCustomerException extends RuntimeException{
    public NotFoundCustomerException(String message) {
        super(message);
    }
}

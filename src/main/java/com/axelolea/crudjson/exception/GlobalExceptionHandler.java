package com.axelolea.crudjson.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundCustomerException.class)
    public ResponseEntity<ErrorObject> handleNotFoundException (
            NotFoundCustomerException ex
    ) {

        HttpStatus code = HttpStatus.NOT_FOUND;
        ErrorObject body = ErrorObject.builder()
                .message(ex.getMessage())
                .statusCode(code.value())
                .timestamp(new Date())
                .build();

        return new ResponseEntity<>(body, code);
    }

}

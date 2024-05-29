package com.test.bank.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler implements ErrorDesc{

    @ExceptionHandler(ErrorSpot.class)
    public ResponseEntity<String> handleException(ErrorSpot ex) {
    	return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

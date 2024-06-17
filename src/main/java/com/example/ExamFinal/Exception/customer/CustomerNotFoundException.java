package com.example.ExamFinal.Exception.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerNotFoundException {
   @ExceptionHandler()
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException ex) {
        return new ResponseEntity<>("Customer not found", HttpStatus.NOT_FOUND);
    }
}

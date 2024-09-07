package com.wipro.ems.exceptions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.ems.exceptions.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler(EmployeeNotFoundException.class)	
   public ResponseEntity<String> handleEmployeeNotFoundException(EmployeeNotFoundException enfe){
	  return new ResponseEntity<String>(enfe.getMessage(), HttpStatus.NOT_FOUND);
   }
}

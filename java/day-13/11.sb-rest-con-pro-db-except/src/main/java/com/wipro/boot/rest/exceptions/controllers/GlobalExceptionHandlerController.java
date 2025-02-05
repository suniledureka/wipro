package com.wipro.boot.rest.exceptions.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.boot.rest.dto.ApiError;
import com.wipro.boot.rest.exceptions.TicketNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandlerController {
	
	@ExceptionHandler(value = TicketNotFoundException.class)
	public ResponseEntity<?> handleTicketNotFoundException(TicketNotFoundException tex, HttpServletRequest httpRequest){
		String exMessage = tex.getMessage();
		String exType = tex.getClass().getSimpleName();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.now();		
		String exDate = formatter.format(ldt);
		
		String path = httpRequest.getRequestURI();
		
		//return new ResponseEntity<String>(exMessage, HttpStatus.NOT_FOUND);
		ApiError error = new ApiError();
		error.setMessage(exMessage);
		error.setType(exType);
		error.setDate(exDate);
		error.setPath(path);
		
		return new ResponseEntity<ApiError>(error, HttpStatus.NOT_FOUND);
	}
}

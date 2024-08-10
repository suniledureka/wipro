package com.wipro.library.exceptions.controllers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.library.exceptions.BookNotFoundException;
import com.wipro.library.exceptions.models.ApiError;

@RestControllerAdvice
public class LibraryAppExceptionHandler {

	/*
	@ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<String> handleBookNotFoundException(Exception ex){
		String message = ex.getMessage();
		String type = ex.getClass().getName();
		String errorMsg = "Error: "+message +" of type: " + type;
		
		return new ResponseEntity<String>(errorMsg, HttpStatus.BAD_REQUEST);
	}
	*/

	@ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<ApiError> handleBookNotFoundException(Exception ex){
		ApiError errorObj = new ApiError();
		
		String msg = ex.getMessage();
		String errorType = ex.getClass().getName();
		LocalDateTime ldt = LocalDateTime.now();
		
		errorObj.setMessage(msg);
		errorObj.setType(errorType);
		errorObj.setTime(ldt);		
			
		return new ResponseEntity<>(errorObj, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidationFailureException(MethodArgumentNotValidException ex){
		//List<ObjectError> errorsList = ex.getBindingResult().getAllErrors();
		List<FieldError> errorsList = ex.getBindingResult().getFieldErrors();
		
		Map<String, String> errorMap = new HashMap<String, String>();		
		
		for(FieldError error : errorsList) {
			String fieldName = error.getField();
			String msg = error.getDefaultMessage();
			//System.out.println(fieldName + ": " + msg);
			errorMap.put(fieldName, msg);
		}
		return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
	}		
}

package com.wipro.boot.rest.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateRestController {
	
	@GetMapping(path = {"/date", "/today"})
	public ResponseEntity<String> showDateAndTime(){
		LocalDateTime ldt = LocalDateTime.now();
		//String dt = ldt.toString();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-YYYY HH:mm:ss");
		String dt = formatter.format(ldt);
		
		//return new ResponseEntity<String>(dt, HttpStatus.OK);
		//return ResponseEntity.ok(dt);
		return ResponseEntity.status(HttpStatus.OK).body(dt);		
	}
}

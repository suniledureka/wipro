package com.wipro.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilRestController {
	@GetMapping("/score")
	public ResponseEntity<String> getCibilScore(@RequestParam("pan") String pan, 
												@RequestParam(name = "name", required = false, defaultValue = "NA") String customerName){
		
		String response = "Hi "+customerName+", please provide a valid PAN";
		
		String pattern = "^[A-Za-z0-9]{10}$";
		
		if(pan.matches(pattern)) {
			int score = 798;
			response = String.format("Hi %s, your CIBIL Score is %d", customerName, score);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		}
		return ResponseEntity.badRequest().body(response);
	}
}

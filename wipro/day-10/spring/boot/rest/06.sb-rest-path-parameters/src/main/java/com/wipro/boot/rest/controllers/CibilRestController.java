package com.wipro.boot.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilRestController {
	@GetMapping("/{pan}/score/{name}")
	public ResponseEntity<String> getCibilScore(@PathVariable("pan") String pan, 
												@PathVariable(name = "name", required = false) String customerName){
		
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

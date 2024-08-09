package com.wipro.boot.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestDataRestController {
	/*
	@PostMapping("/data")	
	public ResponseEntity<String> processRequestHeadersAndData(@RequestHeader("Host") String host, 
									@RequestHeader String company, @RequestBody String data){
		String response = String.format("Host= %s \nCompany= %s \nRequest Data= %s", host, company, data);		
		
		return ResponseEntity.ok(response);		
	}
	*/
	
	@PostMapping("/data")	
	public ResponseEntity<String> processRequestHeadersAndData(@RequestHeader("Host") String host, 
									@RequestHeader(name = "company", required = false, defaultValue = "Wipro") String company, 
									@RequestBody(required = false) String data){
		String response = String.format("Host= %s \nCompany= %s \nRequest Data= %s", host, company, data);		
		
		return ResponseEntity.ok(response);		
	}	
}

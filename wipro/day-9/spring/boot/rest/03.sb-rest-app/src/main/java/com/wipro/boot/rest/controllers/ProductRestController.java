package com.wipro.boot.rest.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductRestController {
/*	
	@PostMapping("/product")
	public ResponseEntity<?> saveProduct(){
		//ResponseEntity<String> respEntity = new ResponseEntity<String>(HttpStatus.CREATED);
		//ResponseEntity<String> respEntity = new ResponseEntity<String>("Product Added to Stock",HttpStatus.CREATED);
		ResponseEntity<String> respEntity = new ResponseEntity<String>("Product Added to Stock",HttpStatus.OK);
		return respEntity;
	}
*/	

/*
	@PostMapping("/product")
	public ResponseEntity<String> saveProduct(){
		//return ResponseEntity.ok("Product Added");
		//return ResponseEntity.status(HttpStatus.OK).build();
		//return ResponseEntity.status(HttpStatus.OK).body("Product Saved");
		//return ResponseEntity.status(HttpStatus.CREATED).body("Product Added");
		
		//return ResponseEntity.badRequest().build();
		//return ResponseEntity.noContent().build();
		
		//return new ResponseEntity<>("No matching product", HttpStatus.NOT_FOUND);
		return ResponseEntity.notFound().build();
	}
*/

	@PostMapping("/product")
	public ResponseEntity<?> saveProduct(){
		//------ including response headers ---------
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("company", "Wipro Technologies");
		headers.add("location", "Mumbai");
		headers.add("contact", "Mr. Christopher");
		
		ResponseEntity<String> respEntity = new ResponseEntity<String>("Product Added to Stock", headers, HttpStatus.OK);
		return respEntity;
	}	
}

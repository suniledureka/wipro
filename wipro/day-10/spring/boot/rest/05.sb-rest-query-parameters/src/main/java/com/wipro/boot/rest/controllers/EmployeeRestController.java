package com.wipro.boot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.boot.rest.services.EmployeeServices;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeServices empService;
	/*
	@GetMapping("/api/ems")
	public ResponseEntity<String> getEmployeeDetails(@RequestParam("eid") Integer id, 
													 @RequestParam(value = "ename", required= false) String name){
		String empDetails = empService.findEmployeeByIdAndName(id,  name);
		
		if(empDetails != null) {
			return new ResponseEntity<>(empDetails, HttpStatus.OK);
		}
		return ResponseEntity.notFound().build();
	}
	*/

	@GetMapping("/api/ems")
	public ResponseEntity<String> getEmployeeDetails(@RequestParam MultiValueMap<String, String> parameters){
		System.out.println(parameters);
		System.out.println(parameters.get("eid")); //java.util.ArrayList
		System.out.println(parameters.get("eid").get(0));
		
		Integer id = Integer.parseInt(parameters.get("eid").get(0));
		String name = parameters.get("ename").get(0);
		
		String empDetails = empService.findEmployeeByIdAndName(id,  name);
		
		if(empDetails != null) {
			return new ResponseEntity<>(empDetails, HttpStatus.OK);
		}
		return ResponseEntity.notFound().build();
	}	
	
}

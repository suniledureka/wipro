package com.wipro.boot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.boot.rest.services.EmployeeServices;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeServices empService;
	
	//@GetMapping("/api/ems/{eid}/{ename}")
	@GetMapping(path = {"/api/ems/{eid}/{ename}", "/api/ems/{eid}"})
	public ResponseEntity<String> getEmployeeDetails(@PathVariable("eid") Integer id, 
													 @PathVariable(value = "ename", required= false) String name){
		String empDetails = empService.findEmployeeByIdAndName(id,  name);
		
		if(empDetails != null) {
			return new ResponseEntity<>(empDetails, HttpStatus.OK);
		}
		return ResponseEntity.notFound().build();
	}
}

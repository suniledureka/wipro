package com.wipro.boot.rest.controllers;

import java.time.LocalDate;
import java.time.Year;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance")
public class InsuranceRestController {
	@GetMapping(value = {"/check/{name}/{yob}", "/{name}/check/{yob}", "/{name}/{yob}/check"})
	public ResponseEntity<String> calculateInsurereAge(@PathVariable("name") String customerName,
										@PathVariable(value = "yob") Integer yob){
		
		if(isValidYoB(yob)) {
			int age = calculateAge(yob);
			return new ResponseEntity<String>(String.format("Hi %s, your are of age %d, and eligible for Insurance", customerName, age), HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Hi "+customerName+" , you are not eligible for Insurance",HttpStatus.BAD_REQUEST);
		}
	}
	
	private Integer getCurrentYear() {
		//return LocalDate.now().getYear();
		return Year.now().getValue();
	}
	
	private boolean isValidYoB(Integer yob) {
		boolean isValid = (yob!=null && yob<getCurrentYear()-10) ? true : false;
		return isValid;
	}
	
	private int calculateAge(int yob) {
		return getCurrentYear() - yob;
	}
}

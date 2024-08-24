package com.wipro.webflux.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.webflux.dto.Customer;
import com.wipro.webflux.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> showAllCustomers(){
		List<Customer> customers = service.getAllCustomers();
		return customers;
	}
}

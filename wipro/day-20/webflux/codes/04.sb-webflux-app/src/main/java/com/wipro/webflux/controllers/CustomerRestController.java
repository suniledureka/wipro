package com.wipro.webflux.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.webflux.dto.Customer;
import com.wipro.webflux.service.CustomerService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {
	
	@Autowired
	private CustomerService service;
	
	//@GetMapping("/all")
	@GetMapping(path = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Customer> showAllCustomers(){
		Flux<Customer> customers = service.getAllCustomers();
		return customers;
	}
}

package com.wipro.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.webflux.dao.CustomerDAO;
import com.wipro.webflux.dto.Customer;

import reactor.core.publisher.Flux;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO customerDao;
	
	public Flux<Customer> getAllCustomers(){
		Long startTime = System.currentTimeMillis();
		
		Flux<Customer> customers =  customerDao.loadAllCustomers();
		
		Long completionTime = System.currentTimeMillis();
		
		System.out.println("time taken for processing = " + (completionTime - startTime) + " milliseconds");
		
		return customers;
	}
}


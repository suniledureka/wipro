package com.wipro.webflux.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.webflux.dao.CustomerDAO;
import com.wipro.webflux.dto.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO customerDao;
	
	public List<Customer> getAllCustomers(){
		Long startTime = System.currentTimeMillis();
		
		List<Customer> customers =  customerDao.loadAllCustomers();
		
		Long completionTime = System.currentTimeMillis();
		
		System.out.println("time taken for processing = " + (completionTime - startTime) + " milliseconds");
		
		return customers;
	}
}


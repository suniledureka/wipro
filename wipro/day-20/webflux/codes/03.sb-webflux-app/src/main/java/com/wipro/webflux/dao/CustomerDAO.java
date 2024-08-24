package com.wipro.webflux.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import com.wipro.webflux.dto.Customer;

@Repository
public class CustomerDAO {
	
	public List<Customer> loadAllCustomers(){
		List<Customer> customers = IntStream.rangeClosed(1, 50)
											.peek(i -> {
												try {
													Thread.sleep(1000);
												}catch(Exception ex) {}
											})
										    .peek(i -> System.out.println("processing customer-"+i))
											.mapToObj(id -> new Customer(id, "Customer - "+ id))
											.collect(Collectors.toList());
		return customers;
	}
}

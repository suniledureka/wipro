package com.wipro.webflux.dao;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import com.wipro.webflux.dto.Customer;

import reactor.core.publisher.Flux;

@Repository
public class CustomerDAO {
	
	public Flux<Customer> loadAllCustomers(){
		Flux<Customer> customers = Flux.range(1, 50)
									   .delayElements(Duration.ofSeconds(1))
									   .doOnNext(id -> System.out.println("processing Customer-"+id))
									   .map(id -> new Customer(id, "Customer - "+ id));										
		return customers;
	}
}

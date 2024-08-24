package com.wipro.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.wipro.webflux.dao.CustomerDAO;
import com.wipro.webflux.dto.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerHandler {
    @Autowired
    private CustomerDAO dao;
	
    public Mono<ServerResponse> loadCustomers(ServerRequest request){
        Flux<Customer> customerList = dao.loadAllCustomers();
		return ServerResponse.ok()
        					 .body(customerList, Customer.class);
    }
    
    public Mono<ServerResponse> loadCustomersAsStream(ServerRequest request){
        Flux<Customer> customerList = dao.loadAllCustomers();
		return ServerResponse.ok()
							 .contentType(MediaType.TEXT_EVENT_STREAM)
        					 .body(customerList, Customer.class);
    }  
    
    public Mono<ServerResponse> findCustomer(ServerRequest request){
         int customerId = Integer.valueOf(request.pathVariable("customerId"));
         
         Mono<Customer> customerMono = dao.loadAllCustomers().filter(customer -> customer.getCustomerId().equals(customerId)).next();
         return ServerResponse.ok()
        		              .body(customerMono, Customer.class);
      }
    
}


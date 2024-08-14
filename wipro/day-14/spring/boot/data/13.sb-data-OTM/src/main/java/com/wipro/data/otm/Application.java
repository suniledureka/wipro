package com.wipro.data.otm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.data.otm.services.EmployeeServices;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private EmployeeServices empServices;
	
	@PostConstruct
	public void doEmployeeAddressOperations() {
		empServices.saveEmployee();
	}
}

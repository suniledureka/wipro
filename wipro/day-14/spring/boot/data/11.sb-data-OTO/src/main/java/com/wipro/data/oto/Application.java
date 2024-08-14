package com.wipro.data.oto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.data.oto.services.EmployeeServices;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private EmployeeServices empService;
	
	@Override
	public void run(String... args) throws Exception {
		//empService.saveEmployee();
		//empService.searchEmployeeById(101);
		empService.deleteEmployeeById(101);
	}
}

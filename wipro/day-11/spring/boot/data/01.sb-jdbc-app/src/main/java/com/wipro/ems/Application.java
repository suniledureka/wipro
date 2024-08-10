package com.wipro.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.ems.dto.Employee;
import com.wipro.ems.services.EmployeeService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private EmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("spring container initialzed");	
		
		/*
		// saving a new employee
		Employee emp = new Employee(101, "Chris", 2500.5f);
		empService.saveEmployee(emp);
		*/
		
		/*
		// updating a new employee
		Employee emp = new Employee(101, "Christopher", 5000f);
		empService.updateEmployee(101, emp);	
		*/
		
		/*
		//deleting an employee
		empService.deleteEmployee(102);
		*/
		
		//getting an employee
		Employee emp = empService.getEmployee(101);
		if(emp != null)
			System.out.println(emp);
		else
			System.out.println("no matching employee found");
		
		System.out.println();
		//to display all the employees
		empService.getAllEmployees();
	}
	
}

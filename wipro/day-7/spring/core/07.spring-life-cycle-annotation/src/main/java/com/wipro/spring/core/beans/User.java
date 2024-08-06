package com.wipro.spring.core.beans;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class User {
	private String firstName;
	private String lastName;

	public User() {
		System.out.println("no argument constructor");
	}

	public String getFirstName() {
		System.out.println("in getFirstName() method");
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("in setFirstName() method");
	}

	public String getLastName() {
		System.out.println("in getLastName() method");
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("in setLastName() method");
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("user-defined initialization");
	}

	@PreDestroy
	public void myDestructor() {
		System.out.println("user-defined destructor");
	}
}

package com.wipro.spring.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
//@Lazy(value = true)
public class User {
	@Value("Sanjay")
	private String firstName;
	
	//@Value("Patil")
	@Value("${wipro.lname}")
	private String lastName;

	public User() {
		System.out.println("no argument constructor");
	}

	@Override
	public String toString() {
		return "User [firstName= " + firstName + ", lastName= " + lastName + "]";
	}

}

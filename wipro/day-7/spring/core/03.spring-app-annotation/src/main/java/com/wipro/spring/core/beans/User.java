package com.wipro.spring.core.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = true)
@Scope(value = "prototype")
public class User {
	@Value("Sunil")
	private String firstName;
	
	//@Value("Joseph")
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

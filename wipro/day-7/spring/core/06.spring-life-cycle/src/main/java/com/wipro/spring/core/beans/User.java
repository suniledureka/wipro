package com.wipro.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;

	public User() {
		System.out.println("no argument constructor");
	}

	public User(String firstName, String lastName) {
		System.out.println("2 arguments constructor");
		this.firstName = firstName;
		this.lastName = lastName;
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

	public void myInit1() {
		System.out.println("user-defined initialization-1");
	}
	public void myInit2() {
		System.out.println("user-defined initialization-2");
	}	
	
	public void myDestructor() {
		System.out.println("user-defined destructor");
	}
}

package com.wipro.spring.core.beans;

public class Customer {
	private String customerName;
	private Car car;
	
	public Customer(String customerName, Car car) {
		super();
		this.customerName = customerName;
		this.car = car;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Car getCar() {
		return car;
	}
}

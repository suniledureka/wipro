package com.wipro.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.spring.core.beans.Customer;

public class Main {

	public static void main(String[] args) {
		var context = new ClassPathXmlApplicationContext("customer-car-beans.xml");

		Customer cust = (Customer) context.getBean("cust1");

		System.out.println(cust.getCustomerName() + ", owns " + cust.getCar().getModel() + " car , which costs Rs."
				+ cust.getCar().getCost());
	}

}

package com.wipro.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

//@Component
//@Component("mycar")
@Component(value = "mycar")
public class Car {

	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	public void startJourney() {
		boolean status = new Random().nextBoolean();
		if(status)
			System.out.println("Happy Journey");
		else
			System.err.println("Journey Cancelled");
	}
}

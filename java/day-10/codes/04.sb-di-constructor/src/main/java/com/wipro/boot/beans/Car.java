package com.wipro.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;	
	
	public Car() {
		super();
	}
	
	@Autowired
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public void startJourney() {
		
		boolean engineStatus = engine.startEngine();
		if(engineStatus)
			System.out.println("Happy Journey");
		else
			System.err.println("Journey Cancelled");
	}
}

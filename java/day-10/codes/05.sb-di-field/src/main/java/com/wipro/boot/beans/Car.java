package com.wipro.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine engine;	

	public void startJourney() {
		
		boolean engineStatus = engine.startEngine();
		if(engineStatus)
			System.out.println("Happy Journey");
		else
			System.err.println("Journey Cancelled");
	}
}

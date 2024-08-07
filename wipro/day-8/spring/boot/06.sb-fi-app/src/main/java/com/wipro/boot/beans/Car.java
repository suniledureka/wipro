package com.wipro.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine engine;

	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	public void startJourney() {
		boolean engineStatus = engine.startEngine();
		
		if(engineStatus)
			System.out.println("###--- HAPPY JOURNEY ---###");
		else
			System.err.println("@@@--- TRIP CANCELLED ---@@@");
	}
}

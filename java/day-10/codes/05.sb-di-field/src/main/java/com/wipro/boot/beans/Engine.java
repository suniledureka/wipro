package com.wipro.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public boolean startEngine() {
		boolean isEngineStarted = new Random().nextBoolean();
		
		if(isEngineStarted) {
			System.out.println("Engine Started..");
			return true;
		}
		return false;
	}
}

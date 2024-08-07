package com.wipro.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine :: Constructor");
	}
	
	public boolean startEngine() {
		System.out.println("starting engine....");
		return new Random().nextBoolean();
	}
}

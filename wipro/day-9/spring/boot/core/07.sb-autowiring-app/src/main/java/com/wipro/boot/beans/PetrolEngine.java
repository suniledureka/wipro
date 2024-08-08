package com.wipro.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine :: Constructor");
	}

	@Override
	public boolean startEngine() {
		System.out.println("starting PETROL engine....");
		return new Random().nextBoolean();
	}

}

package com.wipro.boot.beans;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine :: Constructor");
	}

	@Override
	public boolean startEngine() {
		System.out.println("starting DIESEL engine....");
		return new Random().nextBoolean();
	}
}

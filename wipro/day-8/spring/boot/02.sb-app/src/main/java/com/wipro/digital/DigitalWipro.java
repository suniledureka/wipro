package com.wipro.digital;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DigitalWipro {
	//@Value("1.0.1")
	@Value("${wipro.digital.version}")
	private String version;
	
	public DigitalWipro() {
		System.out.println("DigitalWipro :: Constructor");
	}

	@Override
	public String toString() {
		return "DigitalWipro [version=" + version + "]";
	}
	
}

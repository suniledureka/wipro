package com.wipro.boot.beans.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.boot.utils.PasswordUtility;

@Configuration
public class VehicleConfiguration {

	public VehicleConfiguration() {
		System.out.println("VehicleConfiguration :: Constructor");
	}

	@Bean
	public PasswordUtility getPasswordUtil() {
		return new PasswordUtility();
	}	
}

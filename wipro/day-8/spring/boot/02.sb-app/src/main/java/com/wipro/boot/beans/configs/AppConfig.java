package com.wipro.boot.beans.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.boot.utils.PasswordEncoder;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	//@Bean
	//@Bean(value = "security")
	//@Bean(value = {"security", "encoder"})
	@Bean(value = {"security", "encoder"}, initMethod = "initMethod", destroyMethod = "destroyMethod")
	public PasswordEncoder getDataEncoder() {
		return new PasswordEncoder();
	}
}

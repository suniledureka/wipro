package com.wipro.boot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans = " + noOfBeans);
		System.out.println();
		
		String[] beanNames = context.getBeanDefinitionNames();
		//Arrays.stream(beanNames).forEach(bn -> System.out.println("---> " + bn));
		for(String bn : beanNames) {
			System.out.println("---> " + bn);
		}
		context.close();
	}
}
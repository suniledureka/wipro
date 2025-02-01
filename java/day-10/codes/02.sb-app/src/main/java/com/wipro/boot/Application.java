package com.wipro.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wipro.boot.beans.Car;
import com.wipro.boot.utils.PasswordUtility;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans = " + noOfBeans);
		System.out.println();
		
		/*
		String[] beanNames = context.getBeanDefinitionNames();
		for(String bn : beanNames) {
			System.out.println("---> " + bn);
		}
		*/
		
		//Car car = context.getBean(Car.class);
		//Car car = (Car) context.getBean("car");
		//Car car = context.getBean("car", Car.class);
		Car car = (Car) context.getBean("mycar");		
		car.startJourney();
		
		//PasswordUtility pwdUtil = context.getBean(PasswordUtility.class);
		PasswordUtility pwdUtil = (PasswordUtility) context.getBean("getPasswordUtil");
		String pass = "password";
		String encodedPass = pwdUtil.stringEncoder(pass);
		System.out.println(encodedPass);
		context.close();
	}
}

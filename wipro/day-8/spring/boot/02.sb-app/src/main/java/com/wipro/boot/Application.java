package com.wipro.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.wipro.boot.beans.Car;
import com.wipro.boot.utils.PasswordEncoder;
import com.wipro.digital.DigitalWipro;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.wipro"})
@ComponentScan(basePackages = {"com.wipro.boot", "com.wipro.digital"})
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println();
		
		int noOfBeans = context.getBeanDefinitionCount();
		//System.out.println("no of beans configured = " + noOfBeans);
		LOGGER.info("no of beans configured = {}", noOfBeans);
		//System.out.println();
		
		LOGGER.info(System.lineSeparator());
		
		//Car car = context.getBean(Car.class);
		//Car car = (Car) context.getBean("car");
		//Car car = context.getBean("car", Car.class);
		Car car = (Car) context.getBean("mycar");
		
		car.startJourney();
		
		LOGGER.info(System.lineSeparator());
		
		//PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
		//PasswordEncoder encoder = (PasswordEncoder) context.getBean("getDataEncoder");
		//PasswordEncoder encoder = (PasswordEncoder) context.getBean("security");
		PasswordEncoder encoder = (PasswordEncoder) context.getBean("encoder");
		String originalData = "Wipro Technologies";
		String encodedData = encoder.encodeData(originalData);
		System.out.println("encoded data = " + encodedData);
		
		LOGGER.info(System.lineSeparator());
		
		DigitalWipro dwBean = context.getBean(DigitalWipro.class);
		System.out.println(dwBean);
	}
}

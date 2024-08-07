package com.wipro.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class LauncherApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("###---- LauncherApp ---###");
		int noOfBeans = context.getBeanDefinitionCount();
		
		System.out.println("no of beans configured = " + noOfBeans);
		System.out.println("-".repeat(100));
		
		System.out.println("=============== BEAN NAMES ===============\n");
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println("----> " + beanName);
		}
	}
}

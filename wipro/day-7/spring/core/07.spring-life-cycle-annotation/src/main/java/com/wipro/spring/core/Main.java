package com.wipro.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.spring.core.beans.User;

@Configuration
@ComponentScan(basePackages = {"com.wipro.spring"})
public class Main {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(Main.class)) {

			System.out.println("-----------------------------------------------------------------");
			User usr1 = (User) context.getBean(User.class);
			System.out.println(usr1);

			System.out.println("-----------------------------------------------------------------");
		}
	}
}
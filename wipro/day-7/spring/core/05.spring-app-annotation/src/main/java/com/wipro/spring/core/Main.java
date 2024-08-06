package com.wipro.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.spring.core.beans.User;
import com.wipro.spring.core.beans.User1;
import com.wipro.spring.core.configs.UserConfigurations;

public class Main {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(UserConfigurations.class)) {
			System.out.println("spring container initialized");
			
			User usr1 = context.getBean(User.class);
			System.out.println(usr1);
			
			User usr2 = context.getBean(User.class);
			System.out.println(usr2);

			User usr3 = (User) context.getBean("user");
			System.out.println(usr3);
			System.out.println();
			
			System.out.println(context.getBean(User1.class));
			System.out.println(context.getBean(User1.class));
			System.out.println(context.getBean(User1.class));
		}
	}
}
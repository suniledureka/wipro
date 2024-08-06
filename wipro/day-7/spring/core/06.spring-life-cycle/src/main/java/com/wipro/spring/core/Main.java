package com.wipro.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("-----------------------------------------------------------------");
		User usr1 = (User) context.getBean("user1");
		System.out.println(usr1);

		System.out.println("-----------------------------------------------------------------");
		
		User usr2 = context.getBean("user2", User.class);
		System.out.println(usr2);
		System.out.println("-----------------------------------------------------------------");
		
		((ConfigurableApplicationContext)context).close();
	}
}
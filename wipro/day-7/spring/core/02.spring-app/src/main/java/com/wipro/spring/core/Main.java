package com.wipro.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		// initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");

		System.out.println("-".repeat(100));
		
		User usr1 = (User) context.getBean("user1");
		System.out.println(usr1);
		System.out.println("-".repeat(100));
		
		User usr2 = (User) context.getBean("user1");
		System.out.println(usr2);	
		System.out.println("-".repeat(100));
		
		User usr3 = (User) context.getBean("user1");
		System.out.println(usr3);
		System.out.println("-".repeat(100));
		
		System.out.println(usr1.hashCode() + " - " + usr2.hashCode() + " - " + usr3.hashCode());
		System.out.println("-".repeat(100));
		
		User usr4 = context.getBean("user2", User.class);
		System.out.println(usr4);
	}
}

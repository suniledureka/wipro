package com.wipro.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {		
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("------------------------------------------------------------------------");
		
		User usr1 = context.getBean(User.class);
		System.out.println(usr1);
		
		User usr2 = context.getBean(User.class);
		System.out.println(usr2);
		
		User usr3 = (User) context.getBean("user");
		System.out.println(usr2);			
	}
}
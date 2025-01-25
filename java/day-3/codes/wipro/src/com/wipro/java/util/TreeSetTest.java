package com.wipro.java.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> courseNames = new TreeSet<String>();
		
		System.out.println(courseNames.add("Core Java")); //true
		System.out.println(courseNames.add("Core Java")); //false
		System.out.println(courseNames.add("Adv Java")); //true
		courseNames.add("JPA with Hibernate");
		courseNames.add("Spring");
		courseNames.add("Spring Boot");
		courseNames.add("Microservices");
		courseNames.add("Angular");
		
		System.out.println(courseNames);
		System.out.println("no of courses = " + courseNames.size());
	}
}

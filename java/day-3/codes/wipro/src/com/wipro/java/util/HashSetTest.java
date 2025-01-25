package com.wipro.java.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> courseNames = new HashSet<String>();
		
		System.out.println(courseNames.add("Core Java")); //true
		System.out.println(courseNames.add("Core Java")); //false
		System.out.println(courseNames.add("Adv Java")); //true
		courseNames.add("JPA with Hibernate");
		courseNames.add("Spring");
		courseNames.add("Spring Boot");
		courseNames.add("Microservices");
		courseNames.add("React");
		
		System.out.println(courseNames);
		System.out.println("no of courses = " + courseNames.size());
	}
}

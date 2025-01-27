package com.capgemini.java.lambdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		//-- a predicate to check whether a give number is greater than 10 or not
		Predicate<Integer> p1 = n -> n>10;
		//int num = 9;
		int num = 11;
		System.out.println(num + " is > 10 = " + p1.test(num));
		
		
		//-- a predicate to check the length of a String is > 4 or not
		Predicate<String> p2 = (n) -> (n.length() > 4);
		//String data = "Capg";
		String data = "Capgemini";
		System.out.println("is \""+data+"\" length is > 4 = " + p2.test(data));
		
		//-- a predicate to check whether a Collection is empty or not
		//Predicate<Collection> p3 = col -> col.isEmpty();
		Predicate<Collection> p3 = col -> col.isEmpty();
		
		//List<String> names = Arrays.asList();
		List<String> names = Arrays.asList("Sagar");
		System.out.println("is colletion empty = " + p3.test(names));
	}

}

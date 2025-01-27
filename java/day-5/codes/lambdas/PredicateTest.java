package com.wipro.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {

	public static void main(String[] args) {
		int num = 23;
		Predicate<Integer> evenPredicate = t -> (t % 2 == 0) ? true : false;
	
		boolean isEven = evenPredicate.test(num);
		System.out.println(num + " is Even = " + isEven);
		
		List<String> names = Arrays.asList("Sooraj", "Sunil", "Bharath", "Charles", "Dominick", "Binu", "Arun");
		Predicate<String> strLengthPredicate = str -> str.length() > 5 ? true : false;
		List<String> namesWithLengthMoreThan5 = names.stream().filter(strLengthPredicate).collect(Collectors.toList());
		System.out.println(namesWithLengthMoreThan5);
	}
}

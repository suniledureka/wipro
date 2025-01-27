package com.capgemini.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {
		// get the even numbers from a list of numbers
		List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		//nums.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
		
		Predicate<Integer> evenPredicate = n -> n%2==0;
		nums.forEach(n -> {
			if(evenPredicate.test(n)) {
				System.out.print(n + " | ");
			}
		});
	}

}

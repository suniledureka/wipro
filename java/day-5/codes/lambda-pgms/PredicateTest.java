/**
 * checking number is even or not
 */
package com.capgemini.java.lambdas;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		//Predicate<Integer> p = n -> n%2==0 ? true : false;
		Predicate<Integer> p = n -> n%2==0;
		
		//int num = 12;
		int num = 13;
		boolean result = p.test(num);
		
		if(result)
			System.out.println(num + " is EVEN");
		else
			System.out.println(num + " is NOT EVEN");
	}

}

package com.capgemini.java.lambdas;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateJoins {
	static void filterNums(Predicate<Integer> p, int[] nums) {
		for(int n : nums) {
			if(p.test(n))
				System.out.print(n+", ");
		}
		System.out.println();		
	}
	
	public static void main(String[] args) {
		int[] nums = {0, 5, 10, 15, 20, 25, 30, 35};
		
		Predicate<Integer> p1 = n -> n > 10;
		Predicate<Integer> p2 = n -> n % 2 == 0;
		
		System.out.println("original numbers : " + Arrays.toString(nums));
		
		System.out.print("numbers greater than 10 : ");
		filterNums(p1, nums);
		
		System.out.print("even numbers: ");
		filterNums(p2, nums);
		
		System.out.print("numbers not greater than 10: ");
		filterNums(p1.negate(), nums);
		
		System.out.print("numbers greater than 10 and evens : ");
		filterNums(p1.and(p2), nums);
		
		System.out.print("numbers greater than 10 or even : ");
		filterNums(p1.or(p2), nums);
	}
}

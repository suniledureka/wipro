package com.capgemini.java.lambdas;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateTest3 {

	public static void main(String[] args) {
		int[] nums = {0, 5, 10, 15, 20, 25, 30, 35};
		
		System.out.println("original numbers = " + Arrays.toString(nums));
		
		System.out.print("numbers greater than 10 ===> ");
		Predicate<Integer> greaterThan10Predicate = n -> n > 10;
		filterNums(nums, greaterThan10Predicate);
		
		System.out.print("even numbers ===> ");
		Predicate<Integer> evenNumberPredicate = n -> n%2==0;
		filterNums(nums, evenNumberPredicate);
		
		System.out.print("odd numbers ===> ");
		filterNums(nums, evenNumberPredicate.negate());
		
		System.out.print("odd numbers ===> ");
		filterNums(nums, n -> n%2 != 0);
		
		System.out.print("even numbers greater than 10 ===> ");
		filterNums(nums, greaterThan10Predicate.and(evenNumberPredicate));
	}

	private static void filterNums(int[] nums, Predicate<Integer> predicate) {
			for(int n : nums) {
				if(predicate.test(n))
					System.out.print(n + "\t");
			}
			System.out.println();
	}

}

package com.wipro.java.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sooraj", "Sanjay", "Bharath", "Charles", "Dominick", "Praveen", "Arun");
		System.out.println("original names = " + names);
		
		//sort the list
		Collections.sort(names);
		System.out.println("names in ascending order = " + names);
		/*
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int n = o1.compareTo(o2);
				if(n > 0)
				  return -1;
				else 
				  return 1;	
			}
		});
		*/
		/*
		Collections.sort(names, (o1, o2) -> {
				int n = o1.compareTo(o2);
				if(n > 0)
				  return -1;
				else 
				  return 1;	
			});
		*/
		Collections.sort(names, (o1, o2) -> (o1.compareTo(o2) > 0) ? -1 : 1);		
		System.out.println("names in descending order = " + names);
	}
}
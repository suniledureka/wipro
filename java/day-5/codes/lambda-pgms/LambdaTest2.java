package com.capgemini.java.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaTest2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanjay", "Praveen","Aravind", "Bharath", "Wilson", "Chrales");
		System.out.println(names);
		
		Collections.sort(names, (newName, existingName) -> (newName.compareTo(existingName) > 0) ? -1 : 1);
		System.out.println(names);
	}

}

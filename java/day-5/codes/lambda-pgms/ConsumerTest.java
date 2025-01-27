package com.capgemini.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanjay", "Praveen","Aravind", "Bharath", "Wilson");
		
		//using anonymous class concept
		Consumer<String> consumer1 = new Consumer<String>() {
			public void accept(String name) {
				System.out.print(name + "\t");
			}
		};
		
		names.forEach(consumer1);
		System.out.println("\n"+"-".repeat(100));
		
		//using lambdas
		Consumer<String> consumer2 = (String name) -> {
			System.out.print(name + "\t");
		};
		
		names.forEach(consumer2);
		System.out.println("\n"+"-".repeat(100));

		Consumer<String> consumer3 = (name) -> System.out.print(name + "\t");
		
		names.forEach(consumer3);
		System.out.println("\n"+"-".repeat(100));	
		
		names.forEach(name -> System.out.print(name + "\t"));
	}

}

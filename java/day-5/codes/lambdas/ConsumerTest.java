package com.wipro.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sooraj", "Sanjay", "Bharath", "Charles", "Dominick", "Praveen", "Arun");
		
		//-- using anonymous class concept
		names.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t + "      ");				
			}			
		});
		System.out.println();
		System.out.println("=".repeat(100));
		
		//-- using lambdas
		names.forEach(t -> System.out.print(t + "      "));				
		
	}

}

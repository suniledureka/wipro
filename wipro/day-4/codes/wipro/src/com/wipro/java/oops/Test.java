package com.wipro.java.oops;

public class Test {

	public static void main(String[] args) {
		String name = "Sunil";
		int id = 3456;
		
		System.out.println(String.format("%30s - %d", name, id));
		System.out.println(String.format("%-30s - %d", name, id));
		System.out.format("%30s - %d\n", name, id);
		System.out.format("%-30s - %d", name, id);
	}

}

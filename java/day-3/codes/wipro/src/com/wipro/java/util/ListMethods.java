package com.wipro.java.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		System.out.println("is list empty = " + names.isEmpty());
		System.out.println(names + " | size = " + names.size());
		
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Shilpi");
		names.add("Ramya");
		
		names.add("Sanjay");
		names.add("Praveen");
		names.add("Sanjay");
		
		System.out.println(names + " | size = " + names.size());
		
		names.add(1, "Valerie");
		names.set(1, "VALERIE");
		System.out.println(names + " | size = " + names.size());
		System.out.println();
		
		System.out.println("is \"Sanjay\" in list = " + names.contains("Sanjay"));
		System.out.println();
		
		System.out.println("person in index 0 = " + names.get(0));
		
		System.out.println("indexOf(Sanjay) = " + names.indexOf("Sanjay"));
		System.out.println("lastIndexOf(Sanjay) = " + names.lastIndexOf("Sanjay"));
		System.out.println("indexOf(Sunil) = " + names.indexOf("Sunil")); //-1
		System.out.println();
		
		System.out.println(names.remove(0)); //Sanjay
		System.out.println(names.remove("Sanjay")); //true
		System.out.println(names + " | size = " + names.size());
		System.out.println();
	}
}

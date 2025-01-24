package com.wipro.java.util;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new TreeMap<String, Float>();

		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 12500.5f)); //25000.0
		System.out.println(bank.put("Pankaj", 25000f)); //null
		bank.put("Charles", 11500f);
		bank.put("Rahul", 12500f);
		bank.put("Sachin", 13500.5f);
		
		System.out.println(bank);

	}

}

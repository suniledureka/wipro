package com.wipro.java.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Float> bank = new HashMap<String, Float>();
		
		//put() method returns the previous value associated with key, or null if there was 
		//no mapping for key
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 12500.5f)); //25000.0
		System.out.println(bank.put("Pankaj", 25000f)); //null
		bank.put("Charles", 11500f);
		bank.put("Rahul", 12500f);
		bank.put("Sachin", 13500.5f);
		
		System.out.println(bank);
		System.out.println();
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + bal);
		bal += 1250.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println("-".repeat(100));
		
		System.out.print("A/C Holders :  ");
		Set<String> acHolders = bank.keySet();
		for(String name : acHolders) {
			System.out.print(name + "     ");
		}
		System.out.println();
		System.out.println("-".repeat(100));
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String name = entry.getKey();
			float balance = entry.getValue();
			System.out.println(String.format("%-15s ----> %.2f", name, balance));
			Thread.sleep(2000);
		}
	}
}
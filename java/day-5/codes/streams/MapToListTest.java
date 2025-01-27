package com.capgemini.java.util.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListTest {

	public static void main(String[] args) {
		Map<Integer, String> empsMap = new HashMap<Integer, String>();
		
		empsMap.put(101, "Sanjay");
		empsMap.put(102, "Praveen");
		empsMap.put(103, "Srinivas");
		empsMap.put(104, "Krishna");
		
		//-- create a List of Employee from the Map using stream
		List<Employee> employees = empsMap.entrySet()
										  .stream()
										  .map(entry -> new Employee(entry.getKey(), entry.getValue()))
										  .collect(Collectors.toList());
		
		employees.forEach(emp -> System.out.println(emp));
	}
}

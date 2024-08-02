package com.wipro.java.oops;

public class VarTest {

	public static void main(String[] args) {
		var data = 12;
		System.out.println(data);
	
		var data1 = 12.34;
		System.out.println(data1);
		
		var data2 = "Wipro";
		System.out.println(data2);
		System.out.println(data2.getClass().getName());
		
		var emp = new Employee(101, "Sanjay", 2500f);
		emp.getDetails();
		
		//var data3; //Cannot use 'var' on variable without initializer
		
	}

}

package com.wipro.java.oops;

public class StaticTest {
	String name;
	final static int age; //blank final static variable
	
	StaticTest(){
		System.out.println("constructor");
		name = "Wipro";		
	}
	//-- initalization block
	{
		System.out.println("inside initialization block");
	}
	
	static {
		System.out.println("static block");
		age = 23;
	}
	public static void main(String[] args) {
		System.out.println("main method");
		StaticTest obj1 = new StaticTest();
		StaticTest obj2 = new StaticTest();
	}

}

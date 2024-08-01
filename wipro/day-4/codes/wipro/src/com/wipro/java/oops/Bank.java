package com.wipro.java.oops;

interface Bank
{
	int code = 7896;
	
	void deposit(float amt);
	void withdraw(float amt);
	
	default void gstProcess() {
		System.out.println("GST Processing in - " + this.getClass().getSimpleName());
	}
	
	static void aTestMethod() {
		System.out.println("static method in interface");
	}
}
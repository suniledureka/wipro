package com.wipro.java.oops;
class A{
	int a=10, b=20;
	void displayAB() {
		System.out.println("in class A - " + a + ", " + b);
	}
}

class B extends A{
	int c=30;
	void displayABC() {
		System.out.println("in class A - " + a + ", " + b +", " + c);
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a + " | " + obj.b + " | " + obj.c);
		obj.displayAB();
		obj.displayABC();
	}
}

package com.wipro.java.oops;

class A2{
	public A2() {
		System.out.println("class A2 :: Constructor");
	}
}

class B2 extends A2{
	public B2() {
		System.out.println("class B2 :: Constructor");
	}
}

public class SuperConstructors {

	public static void main(String[] args) {
		B2 obj = new B2();
	}
}

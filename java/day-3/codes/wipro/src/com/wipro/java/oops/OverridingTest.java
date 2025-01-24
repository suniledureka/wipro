package com.wipro.java.oops;

class A1{
	void display() {
		System.out.println("class A1 - display()");
	}
}

class B1 extends A1{
	@Override
	void display() {
		System.out.println("class B1 - display()");
		super.display();
	}	
}

public class OverridingTest {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.display();
	}

}

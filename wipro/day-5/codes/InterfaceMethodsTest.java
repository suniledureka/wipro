package com.wipro.java.oops;

interface Inter1{}

class InterImpl implements Inter1{}

public class InterfaceMethodsTest {
	public static void main(String[] args) {
		Inter1 obj = new InterImpl();
		
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
}

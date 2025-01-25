package com.wipro.java.oops;

public class Triangle extends Shape {
	int base, height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public void area() {
		System.out.printf("area of triangle = %.2f\n" , ((0.5f)*this.base*this.height));
	}

}

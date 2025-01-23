package com.wipro.java.oops;

abstract public class Shape {
	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void area();
}

package com.wipro.java.oops;

public class Student {
	static int id = 1001;	
	static String collegeName = "Wipro Academy";
	int sid;
	String sname;
	
	public Student(String sname) {
		super();
		sid = generateId();
		this.sname = sname;
	}
	
	private static int generateId() {
		return id++;
	}

	@Override
	public String toString() {
		return String.format("%4d\t %-20s %s", sid, sname, collegeName);
	}	
}

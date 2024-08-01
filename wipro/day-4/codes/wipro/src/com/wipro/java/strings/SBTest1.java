package com.wipro.java.strings;

public class SBTest1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb + " | size=" + sb.length() + " | capacity=" + sb.capacity());
		
		sb.append("Wipro Technologi");
		System.out.println(sb + " | size=" + sb.length() + " | capacity=" + sb.capacity());
		
		sb.append("es");
		System.out.println(sb + " | size=" + sb.length() + " | capacity=" + sb.capacity());
		
		sb.insert(0, 7654);
		System.out.println(sb + " | size=" + sb.length() + " | capacity=" + sb.capacity());
		
		sb.reverse();
		System.out.println(sb);
		System.out.println("=".repeat(100));
		
		StringBuffer sb1 = new StringBuffer("Wipro");
		System.out.println("\u001B[33m"+sb1 + " | size = " + sb1.length() + " | Capacity = " + sb1.capacity() +"\u001B[0m");
		
		sb1.ensureCapacity(100);
		System.out.println("\u001B[35m" +sb1 + " | size = " + sb1.length() + " | Capacity = " + sb1.capacity() + "\u001B[0m");
		
		sb1.append(" Technologies");
		System.out.println(sb1 + " | size = " + sb1.length() + " | Capacity = " + sb1.capacity());
		
		sb1.setLength(8);
		System.out.println(sb1 + " | size = " + sb1.length() + " | Capacity = " + sb1.capacity());
		
		sb1.trimToSize();
		System.out.println(sb1 + " | size = " + sb1.length() + " | Capacity = " + sb1.capacity());
		
		System.err.println("error message");
	}
}

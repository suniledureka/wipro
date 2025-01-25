package com.wipro.java.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> marks = Arrays.asList(98,79,65,74,83,90,77);
		System.out.println(marks);
		
		iterate1(marks);
		Thread.sleep(2000);
		
		iterate2(marks);
		Thread.sleep(2000);
		
		iterate3(marks);
		Thread.sleep(2000);		
		
		iterate4(marks);
		Thread.sleep(2000);			
		
		iterate5(marks);
		Thread.sleep(2000);			
		
		iterate6(marks);
		Thread.sleep(2000);		
		
		iterate7(marks);
		Thread.sleep(2000);			
	}

	private static void iterate1(List<Integer> marks) {
		System.out.println("===> list iteration using for loop & get() -- only for List implementations");
		for(int i=0; i<marks.size(); i++) {
			Integer mark = marks.get(i);
			System.out.print(mark + "      ");
		}
		System.out.println("\n");
	}

	private static void iterate2(List<Integer> marks) {
		System.out.println("===> list iteration using enhanced for loop");
		for(Integer mark : marks) {
			System.out.print(mark + "      ");
		}
		System.out.println("\n");
	}	
	
	private static void iterate3(List<Integer> marks) {
		System.out.println("===> list iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer mark = it.next();
			System.out.print(mark + "      ");
		}
		System.out.println("\n");
	}
	
	private static void iterate4(List<Integer> marks) {
		System.out.println("===> list iteration using java.util.ListIterator - only for List implementations");
		ListIterator<Integer> it = marks.listIterator();
		while(it.hasNext()) {
			int index = it.nextIndex();
			Integer mark = it.next();
			System.out.print(index + ": " + mark + "      ");
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			int index = it.previousIndex();
			Integer mark = it.previous();
			System.out.print(index + ": " + mark + "      ");
		}		
		System.out.println("\n");
	}
	
	private static void iterate5(List<Integer> marks) {
		System.out.println("===> list iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		while(en.hasMoreElements()) {
			Integer mark = en.nextElement();
			System.out.print(mark + "      ");
		}
		System.out.println("\n");
	}
	
	private static void iterate6(List<Integer> marks) {
		System.out.println("===> list iteration using forEach() method");
		marks.forEach(mark -> System.out.print(mark + "      "));
		System.out.println("\n");
	}	
	
	private static void iterate7(List<Integer> marks) {
		System.out.println("===> list iteration using Stream API and forEach");
		Stream<Integer> marksStream = marks.stream();
		marksStream.forEach(mark -> System.out.print(mark + "      "));
		System.out.println("\n");
	}	
}

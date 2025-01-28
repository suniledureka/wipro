package com.wipro.testing.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LargestTest1 {
	private static Largest larObj;
	
	@BeforeAll
	public static void testInit() {
		larObj = new Largest();
		System.out.println("inside test initialization");
	}

	@AfterAll
	public static void testCompletion() {
		larObj = null;
		System.out.println("inside test completion");
	}
	

	@Test
	void testFindLargest() {
		int[] data = {87, 54, 96, 63, 52, 12};
		
		int expected = 96;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}

	@Test
	void testFindLargest1() {
		int[] data = {-87, 54, -96, -63, 52, 12};
		
		int expected = 54;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testFindLargest2() {
		int[] data = {-87, -54, -96, -63, -52, -12};
		
		int expected = -12;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}	
	
	@Test
	void testFindLargest3() {
		int[] data = {};		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> larObj.findLargest(data));
	}	
}

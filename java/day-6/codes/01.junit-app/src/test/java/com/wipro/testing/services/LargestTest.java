package com.wipro.testing.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestTest {

	@Test
	void testFindLargest() {
		Largest larObj = new Largest();
		
		int[] data = {87, 54, 96, 63, 52, 12};
		
		int expected = 96;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}

	@Test
	void testFindLargest1() {
		Largest larObj = new Largest();
		
		int[] data = {-87, 54, -96, -63, 52, 12};
		
		int expected = 54;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testFindLargest2() {
		Largest larObj = new Largest();
		
		int[] data = {-87, -54, -96, -63, -52, -12};
		
		int expected = -12;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}	
	
	@Test
	void testFindLargest3() {
		Largest larObj = new Largest();
		
		int[] data = {};		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> larObj.findLargest(data));
	}	
}

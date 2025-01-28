package com.wipro.testing.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("FIND LARGEST")
@TestMethodOrder(OrderAnnotation.class)
//@Disabled
class LargestTest {
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
	@DisplayName("ALL POSITIVE NUMS")
	@Order(1)
	void testFindLargest() {		
		int[] data = {87, 54, 96, 63, 52, 12};
		
		int expected = 96;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("+ve & -ve NUMS")
	void testFindLargest1() {
		int[] data = {-87, 54, -96, -63, 52, 12};
		
		int expected = 54;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("ALL Negative")
	void testFindLargest2() {
		int[] data = {-87, -54, -96, -63, -52, -12};
		
		int expected = -12;
		int actual = larObj.findLargest(data);
		
		assertEquals(expected, actual);
	}	
	
	@Test
	@DisplayName("No Data")
	@Order(2)
	//@Disabled
	void testFindLargest3() {
		int[] data = {};		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> larObj.findLargest(data));
	}	
}

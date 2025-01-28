package com.wipro.testing.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CheckEvenTest {
	private static CheckEven obj ;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj = new CheckEven();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		obj = null;
	}

	@Test
	@DisplayName(value = "EVEN TEST")
	@RepeatedTest(value = 3, name = "{displayName} - {currentRepetition} / {totalRepetitions}")
	void testIsEven() {
		int n = 22;
		assertTrue(obj.isEven(n));
	}

}

package comm.wipro.testing.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeTest {
	static Palindrome palObj = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		palObj = new Palindrome();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		palObj = null;
	}

	@ParameterizedTest
	@ValueSource(strings = {"eye", "malayalam", "madam", "liril"})
	void testIsPalindrome1(String str) {
		System.out.println("palindrome test for - " + str);
		boolean result = palObj.isPalindrome(str);
		assertTrue(result);
	}


	//@Test
	void testIsPalindrome2() {
		String str = "Java";
		boolean result = palObj.isPalindrome(str);
		assertFalse(result);
	}	
	/*
	@Test
	void testIsPalindrome3() {
		String str = "Madam";
		boolean result = palObj.isPalindrome(str);
		assertTrue(result);
	}
	
	@Test
	void testIsPalindrome4() {
		String str = "malayalam";
		boolean result = palObj.isPalindrome(str);
		assertTrue(result);
	}
	*/	
}

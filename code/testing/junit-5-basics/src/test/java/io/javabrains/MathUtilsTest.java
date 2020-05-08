package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils mathUtils = new MathUtils();
	
	@Test
	public void sumTrue() {
		boolean expected = true;
		assertEquals(expected, mathUtils.checkPalindrome("noon"));
	}
	
	@Test
	public void sumNotTrue() {
		boolean expected = false;
		assertEquals(expected, mathUtils.checkPalindrome("adcba"));
	}
}

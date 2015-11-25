package com.java.service.factorial;

import junit.framework.TestCase;

import org.junit.Test;

public class FactorialTest extends TestCase {

	@Test
	public void testSingleInteger() {
		int number = 7;
		long factResult = FactorialService.getFactorial(number);
		assertTrue(factResult == 5040);
	}

	@Test
	public void testMultipleIntegers() {
		int[] numbers = new int[4];
		numbers[0] = 5;
		numbers[1] = 8;
		numbers[2] = 0;
		numbers[3] = -5;

		try {
			FactorialService.getFactorial(numbers);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// assertTrue(factResult == 5040);
	}

}

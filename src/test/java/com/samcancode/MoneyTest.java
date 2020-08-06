package com.samcancode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);// now it will pass after code refactoring
	}

}
/*
 * 1. Write a Test - Think about how the code should work. 2. Make it Run -
 * Quickly get the code working. Make the test Green. 3. Make it Right -
 * Refactor the running code to quality, proper code.
 */
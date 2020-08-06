package com.samcancode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(new Dollar(10), product); //with new equals() method, we can do this
		product = five.times(3);
		assertEquals(new Dollar(15), product);
	}
	
	@Test
	void testEquality() {
		assertEquals(new Dollar(5), new Dollar(5)); // by default, java equality check if objects points to same object.
		assertNotEquals(new Dollar(5), new Dollar(8)); 
	}

}
/*
 * 1. Write a Test - Think about how the code should work. 
 * 2. Make it Run - Quickly get the code working. Make the test Green. 
 * 3. Make it Right - Refactor the running code to quality, proper code.
 */
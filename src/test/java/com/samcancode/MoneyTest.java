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

	@Test
	void testMultiplicationFranc() {
		Franc five = new Franc(5);
		Franc product = five.times(2);
		assertEquals(new Franc(10), product);
		product = five.times(3);
		assertEquals(new Franc(15), product);
	}
	
	@Test
	void testEqualityFranc() {
		assertEquals(new Franc(5), new Franc(5));
		assertNotEquals(new Franc(5), new Franc(8)); 
	}
	
}

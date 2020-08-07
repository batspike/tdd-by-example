package com.samcancode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class MoneyTest {

	@Test
	@Order(1)
	void testMultiplication() {
		Money fiveDollar = Money.dollar(5);
		assertEquals(Money.dollar(10), fiveDollar.times(2)); 
		assertEquals(Money.dollar(15), fiveDollar.times(3));

		Money fiveFranc = Money.franc(5);
		assertEquals(Money.franc(10), fiveFranc.times(2));
		assertEquals(Money.franc(15), fiveFranc.times(3));
	}
	
	@Test
	@Order(2)
	void testEquality() {
		assertEquals(Money.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(5), Money.dollar(8)); 
		assertNotEquals(Money.dollar(5), Money.franc(5)); 
	}

	@Test
	@Order(3)
	void testEqualityFranc() {
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(8)); 
	}
	
	@Test
	@Order(4)
	void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	@Test
	@Order(5)
	void testSimpleAddition() {
		Money fiveDollar = Money.dollar(5);
		Expression sum = fiveDollar.plus(fiveDollar);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
	}
	
	@Test
	@Order(6)
	void testPlusReturnsSum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}
	
	@Test
	@Order(7)
	void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, Money.currencyDollar);
		assertEquals(Money.dollar(7), result);
	}
	
	@Test
	@Order(8)
	void testReduceMoney() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), Money.currencyDollar);
		assertEquals(Money.dollar(1), result);
	}
	
	@Test
	@Order(9)
	void testReduceMoneyDifferentCurrency() {
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result = bank.reduce(Money.franc(2), Money.currencyDollar);
		assertEquals(Money.dollar(1), result);
	}
	
	@Test
	@Order(10)
	void testIdentityRate() {
		assertEquals(1, new Bank().rate(Money.currencyDollar, Money.currencyDollar));
		assertEquals(1, new Bank().rate(Money.currencyFranc, Money.currencyFranc));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

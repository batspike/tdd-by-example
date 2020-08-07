package com.samcancode;

public class Sum implements Expression {
	Money addend;
	Money augend;
	
	public Sum(Money addend, Money augend) {
		this.addend = addend;
		this.augend = augend;
	}
	
	@Override
	public Money reduce(Bank bank, String to) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, to);
	}
}

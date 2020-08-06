package com.samcancode;

public class Franc extends Money {
	
	protected Franc(int amount, String currency) {
		super(amount, currency);
	}

	@Override
	public Money times(int multiplier) {
		return Money.franc(this.amount * multiplier);
	}

	@Override
	public String currency() {
		return currency;
	}

}

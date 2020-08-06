package com.samcancode;

public class Dollar extends Money {
	
	protected Dollar(int amount, String currency) {
		super(amount,currency);
	}

	@Override
	public Money times(int multiplier) {
		return Money.dollar(this.amount * multiplier);
	}

}

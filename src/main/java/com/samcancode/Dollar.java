package com.samcancode;

public class Dollar extends Money {

	public Dollar(int amount) {
		super(amount);
	}

	@Override
	public Money times(int multiplier) {
		return Money.dollar(this.amount * multiplier);
	}


}

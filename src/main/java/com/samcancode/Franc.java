package com.samcancode;

public class Franc extends Money {

	public Franc(int amount) {
		super(amount);
	}

	@Override
	public Money times(int multiplier) {
		return Money.franc(this.amount * multiplier);
	}

}

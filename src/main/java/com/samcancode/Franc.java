package com.samcancode;

public class Franc extends Money {

	public Franc(int i) {
		this.amount = i;
	}

	public Franc times(int i) {
		return new Franc(amount * i);
	}

}

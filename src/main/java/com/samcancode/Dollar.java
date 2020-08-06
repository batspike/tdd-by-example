package com.samcancode;

public class Dollar {

	public Integer amount;

	public Dollar(int i) {
		this.amount = i;
	}

	public Dollar times(int i) {
		return new Dollar(amount * i); //refactor to prevent object degeneration
	}

}

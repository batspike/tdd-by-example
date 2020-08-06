package com.samcancode;

public class Dollar {

	public Integer amount;

	public Dollar(int i) {
		this.amount = i;
	}

	public void times(int i) {
		amount *= i;
	}

}

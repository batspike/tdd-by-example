package com.samcancode;

public interface Expression {
	Money reduce(Bank bank, String to);
}

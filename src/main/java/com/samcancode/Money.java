package com.samcancode;

public abstract class Money {
	public static String currencyDollar = "USD";
	public static String currencyFranc  = "CHF";
	
	protected Integer amount;
	protected String currency;
	
	public Money(int amount, String currency) { 
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Dollar dollar(int amount) {
		return new Dollar(amount, Money.currencyDollar);
	}
	
	public static Franc franc(int amount) {
		return new Franc(amount, Money.currencyFranc);
	}
	
	public abstract Money times(int multiplier);
	
	public String currency() {
		return currency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money money = (Money) obj;
		if (amount == null) {
			if (money.amount != null)
				return false;
		} else if (!amount.equals(money.amount))
			return false;
		return true;
	}
	

}

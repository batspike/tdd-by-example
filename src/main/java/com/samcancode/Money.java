package com.samcancode;

public class Money implements Expression {
	public static String currencyDollar = "USD";
	public static String currencyFranc  = "CHF";
	
	protected Integer amount;
	protected String currency;
	
	public Money(int amount, String currency) { 
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Money(amount, Money.currencyDollar);
	}
	
	public static Money franc(int amount) {
		return new Money(amount, Money.currencyFranc);
	}
	
	public Money times(int multiplier) {
		return new Money(this.amount * multiplier, this.currency);
	}
	
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
		if ( !currency().equalsIgnoreCase(((Money)obj).currency()) )
			return false;
		Money money = (Money) obj;
		if (amount == null) {
			if (money.amount != null)
				return false;
		} else if (!amount.equals(money.amount))
			return false;
		return true;
	}

	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}
	
	@Override
	public Money reduce(Bank bank, String to) {
		return new Money(this.amount/bank.rate(this.currency,to), to);
	}
	

}

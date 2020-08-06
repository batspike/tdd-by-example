package com.samcancode;

public class Dollar {

	public Integer amount;

	public Dollar(int i) {
		this.amount = i;
	}

	public Dollar times(int i) {
		return new Dollar(amount * i); //refactor to prevent object degeneration
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
		Dollar other = (Dollar) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		return true;
	}
	
	

}

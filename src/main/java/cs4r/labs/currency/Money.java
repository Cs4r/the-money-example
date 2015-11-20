package cs4r.labs.currency;

class Money {
	protected int amount;
	protected String currency;

	static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	String currency() {
		return currency;
	}

	@Override
	public boolean equals(Object other) {
		Money money = (Money) other;
		return this.amount == money.amount && currency().equals(money.currency());
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

}

package entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		balance+=amount;
	}
	
	public void withdraw(Double amount) {
		try {
			if(amount > balance)
				throw new IllegalArgumentException("Not enough balance on your account. Balance: "+balance);
			if(amount > withdrawLimit)
				throw new IllegalArgumentException("Withdraw bigger than the limit. Withdraw Limit:"+withdrawLimit);
			balance-=amount;
		}
		catch(IllegalArgumentException i) {
			System.out.println(("Withdraw error: "+i.getMessage()));
		}
	}
	
	@Override
	public String toString() {
		return number+": "+holder+". Balance: "+balance;
	}
}

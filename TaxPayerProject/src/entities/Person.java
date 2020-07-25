package entities;

public final class Person extends TaxPayer{
	private Double healthExpenses;

	public Person(String n, Double aI, Double hE) {
		super(n,aI);
		healthExpenses = hE;
	}
	
	public Double tax() {
		double tax = 0.0;
		if(annualIncome < 20000)
			tax = 0.15*annualIncome;
		else tax = 0.25*annualIncome;
		if(healthExpenses != 0)
			tax-=(0.5*healthExpenses);
		return tax;
	}

}

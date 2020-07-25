package entities;

public final class Entity extends TaxPayer {
	private Integer numEmployees = 0;
	public Entity(String n) {
		super(n);
	}

	public Entity(String n, Double aI) {
		super(n, aI);
	}
	
	public Entity(String n, Double aI, Integer nE) {
		super(n, aI);
		numEmployees = nE;
	}

	@Override
	public Double tax() {
		if(numEmployees < 10)
			return 0.16*annualIncome;
		else
			return 0.14*annualIncome;
	}

}

package entities;

public abstract class TaxPayer {
	protected String name;
	protected Double annualIncome = 0.0;
	public abstract Double tax();
	
	public TaxPayer(String n) {
		name = n;
	}
	
	public TaxPayer(String n, Double aI) {
		name = n;
		annualIncome = aI;
	}
	
	@Override
	public String toString() {
		return name+" - Tax paid: $"+String.format("%.2f", tax())+" - Net Salary: $"+String.format("%.2f",(annualIncome-tax()));
	}
}

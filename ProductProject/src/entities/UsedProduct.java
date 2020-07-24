package entities;

import java.util.Date;

public final class UsedProduct extends Product{
	private Date manufactureDate;
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name+" (used)", price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag()+" (Manufacture date: "+
				sdf.format(manufactureDate)+")";
	}
}

package entities;

import java.text.SimpleDateFormat;

public class Product {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private Double price;
	public String priceTag() {
		return name+" $ "+String.format("%.2f", price);
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name+" $ "+String.format("%.2f", price);
	}
	
}

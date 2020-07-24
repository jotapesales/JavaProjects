package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import entities.*;

public class Main {
	public static void main(String[] args) throws ParseException {
		List<Product> listProduct = new ArrayList<>();
		Product tablet = new ImportedProduct("Tablet",260.0, 20.0);
		Product notebook = new Product("Notebook", 1100.0);
		Product iphone = new UsedProduct("Iphone", 400.0, Product.sdf.parse("15/03/2017"));
		listProduct.add(tablet);
		listProduct.add(notebook);
		listProduct.add(iphone);
		System.out.println("PRICE TAGS:");
		for(Product p : listProduct)
			System.out.println(p.priceTag());
	}
}

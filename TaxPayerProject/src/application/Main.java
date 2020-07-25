package application;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class Main {

	public static void main(String[] args) {
		List<TaxPayer> listTPayer = new ArrayList<>();
		listTPayer.add(new Person("Alex",50000.0,2000.0));
		listTPayer.add(new Entity("SoftTech",400000.0,25));
		listTPayer.add(new Person("Bob",120000.0,1000.0));
	
		System.out.println("TAXES PAID:");
		double sum = 0;
		for(TaxPayer TP : listTPayer) {
			System.out.println(TP);
			sum+=TP.tax();
		}
		System.out.println("TOTAL TAXES: $"+sum);			
	}
}

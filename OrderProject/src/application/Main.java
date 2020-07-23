package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat birth = new SimpleDateFormat("dd/MM/yyyy");
		Client client = new Client("Alex Green","alex@gmail.com",birth.parse("15/03/1985"));
		Order order = new Order(client);
		Product tv = new Product("TV", 1000.0);
		Product mouse = new Product("Mouse",40.00);
		OrderItem item1 = new OrderItem(2,tv);
		OrderItem item2 = new OrderItem(1,mouse);
		order.addItem(item1);
		order.addItem(item2);
		order.changeOrderStatus();
		System.out.println(order);
		
		
		sc.close();

	}

}

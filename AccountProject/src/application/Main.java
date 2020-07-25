package application;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account(8021,"Bob Brown",500.0,300.0);
		acc.withdraw(400.0);
		System.out.println(acc);
		acc.withdraw(300.0);
		System.out.println(acc);
	}

}

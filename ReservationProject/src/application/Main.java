package application;

import entities.Reservation;

public class Main {

	public static void main(String[] args){
		Reservation room = new Reservation(8021,"21/09/2020","22/09/2020");
		System.out.println(room);
	}

}

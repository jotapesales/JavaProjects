package application;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class Main {
	public static void main(String[] args) {
	List<Employee> listEmployee = new ArrayList<>();
	Employee alex = new Employee("Alex",50,20.0);
	listEmployee.add(alex);
	Employee bob = new OutsourcedEmployee("Bob",100,15.0,200.0);
	listEmployee.add(bob);
	Employee maria = new Employee("Maria",60,20.0);
	listEmployee.add(maria);
	System.out.println("PAYMENTS:\n");
	for(Employee e : listEmployee)
		System.out.println(e);
	}
}

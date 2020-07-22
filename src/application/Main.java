package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name:");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level:");
		String workerLevel = sc.nextLine();
		System.out.println("Base Salary: ");
		double workerBaseSalary = sc.nextDouble();
		Worker w = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
		
		sc.close();
	}

}
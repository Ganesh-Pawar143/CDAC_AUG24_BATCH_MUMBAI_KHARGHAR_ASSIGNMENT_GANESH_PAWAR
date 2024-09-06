package org.example;

import java.util.Scanner;

class Employee {
	private String Name;
	private int Empid;
	private float Salary;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name	:");
		Name = sc.nextLine();
			
		System.out.print("Enter Empid	:");
		Empid=sc.nextInt();
		
		System.out.print("Enter Salary	:");
		Salary=sc.nextFloat();
		

	}

	public void  printRecord (){
		
		System.out.println("Name	:" + Name);
		
		System.out.println("Empid	:" + Empid);
		
		System.out.println("Salary	:" + Salary);
		

	}

}

public class Program {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		
		emp1.acceptRecord();

		emp1.printRecord();

	}

}

package org.example;

import java.util.Scanner;

class Account {

	int AccountNo;
	String AccType;
	float Balance;
	String Status;

	void getRecord() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Accout number	: ");
		this.AccountNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account Type	: ");
		this.AccType = sc.nextLine();
		System.out.print("Enter Account Balance	: ");
		this.Balance = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter Account Status	: ");
		this.Status = sc.nextLine();

	}
	
	void setRecord(int AccountNo,String AccType,float Balance,String Status) {
		
		this.AccountNo=AccountNo;
		this.AccType=AccType;
		this.Balance=Balance;
		this.Status=Status;
	}
	

	void printRecord() {

		System.out.println("Account Number	:" + this.AccountNo);

		System.out.println("Account Type	:" + this.AccType);

		System.out.println("Account Balance	:" + this.Balance);

		System.out.println("Account Status	:" + this.Status);

	}

}

public class TopClassExample {

	public static void main(String[] args) {
		Account emp1=new Account();	
		emp1.setRecord(112233,"Saving",12000,"Active");
		emp1.printRecord();
		
		
		Account emp2=new Account();	
		
		emp2.getRecord();
		emp2.printRecord();
		

		

	}

}

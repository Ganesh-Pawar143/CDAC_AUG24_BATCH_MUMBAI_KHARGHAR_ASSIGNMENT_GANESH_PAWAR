package org.example;

import java.util.Scanner;
import java.math.*;

class CompoundInterestCalculator {
	/*
	 * Accept the initial investment amount, annual interest rate, number of times
	 * the interest is compounded per year, and investment duration (in years) from
	 * the user.
	 */
	private double principal;
	private double annualInterestRate;
	private int numberOfCompounds;
	private int years;
	private double totalInterest;
	private double futureValue;

	// acceptRecord , calculateFutureValue, printRecord
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Initial investment amount	: ");
		this.principal = sc.nextDouble();
		System.out.print("Enter Annual Interest Rate	: ");
		this.annualInterestRate = sc.nextDouble() / 100;
		System.out.print("Enter Number of Compounds	: ");
		this.numberOfCompounds = sc.nextInt();
		System.out.print("Enter Investment Duration	:");
		this.years = sc.nextInt();

	}

	public void calculateFutureValue() {

		futureValue = principal * Math.pow(1 + (annualInterestRate / numberOfCompounds), numberOfCompounds * years);
		totalInterest = (futureValue - principal);

	}

	public void printRecord() {
		// 3. Display the future value and the total interest earned, in Indian Rupees
		// (₹).
		System.out.printf("Future Value	:%.2f ", this.futureValue);

		System.out.printf("\n Future totalInterest	: %.2f ", this.totalInterest);

	}

}

public class CompoundIntrest {

	public static void main(String[] args) {

		CompoundInterestCalculator CIC = new CompoundInterestCalculator();
		CIC.acceptRecord();
		CIC.calculateFutureValue();
		CIC.printRecord();

	}

}

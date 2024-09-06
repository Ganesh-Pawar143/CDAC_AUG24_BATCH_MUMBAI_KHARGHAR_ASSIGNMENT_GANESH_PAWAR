package org.example;

import java.util.Scanner;
import java.math.*;

//CLASS LoanAmortizationCalculator
class LoanAmortizationCalculator {

	// FIELDS OF CLASS NON STATIC FILED
	double Principle;
	double AnnIntrestRate;
	double LoanYear;
	double monthlyPayment;
	double totalPayment;

	// METHOD DEFINATION
	void acceptRecord() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Principle Amount	:");
		this.Principle = sc.nextDouble();
		System.out.print("Enter Annual Interest Rate	:");
		this.AnnIntrestRate = sc.nextDouble();
		System.out.print("Enter Loan Year	:");
		this.LoanYear = sc.nextDouble();

	}

	void calculateMonthlyPayment() {
		double monthlyInterestRate = AnnIntrestRate / (12 * 100);
		double numberOfMonths = LoanYear * 12;
		monthlyPayment = (Principle * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfMonths)))/ ((Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1))));
		totalPayment = (monthlyPayment * numberOfMonths);

	}

	void printRecord() {

		System.out.printf("Monthly Payment	: %.2f", this.monthlyPayment);
		System.out.printf("\nTotal Payment	: %.2f", this.totalPayment);
		;

	}

}

public class LoanAmortization {

	public static void main(String[] args) {

		LoanAmortizationCalculator lac = new LoanAmortizationCalculator(); // INSTANTIATION
		lac.acceptRecord(); // CALL METHOD BY CLASS...MESSAGE PASSING
		lac.calculateMonthlyPayment();
		lac.printRecord();

	}

}

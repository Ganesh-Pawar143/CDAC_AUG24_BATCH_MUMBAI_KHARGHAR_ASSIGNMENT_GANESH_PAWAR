package org.example;

import java.util.Scanner;

class DiscountCalculator {
	float Price;
	float DisPercentage;
	float discountAmount;
	float finalPrice;
	
	//acceptRecord, calculateDiscount & printRecord 
	void acceptRecord() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Price of Product	:");
		this.Price=sc.nextFloat();
		System.out.print("Enter Discount Percentage	:");
		this.DisPercentage=sc.nextFloat();
	}
	void calculateDiscount() {
		/* Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
		Final Price Calculation: finalPrice = originalPrice - discountAmount */
		
		discountAmount = Price * (DisPercentage / 100);
		finalPrice = Price - discountAmount;

	}
	
	void printRecord() {
		System.out.printf("Discount Amount is	: %.2f",this.discountAmount);
		System.out.printf("\nFinal Price of Product	:%.2f",this.finalPrice);
		
	}
	
}

public class DiscountCalculation {

	public static void main(String[] args) {
		
		DiscountCalculator dc=new DiscountCalculator();
		
		dc.acceptRecord();
		dc.calculateDiscount();
		dc.printRecord();
		
		

	}

}

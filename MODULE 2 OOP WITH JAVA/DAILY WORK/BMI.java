package org.example;

import java.util.Scanner;

class BMITracker {
	float Height;
	float Weight;
	float BMIIndex;

	// acceptRecord, calculateBMI, classifyBMI & printRecord
	void acceptRecord() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Weight (in KG)	:");
		this.Weight = sc.nextFloat();
		System.out.print("Enter your Height (in Meter)	:");
		this.Height = sc.nextFloat();
	}

	void calculateBMI() {
		BMIIndex = Weight / (Height * Height);

	}

	void classifyBMI() {
		if (BMIIndex < 18.5) {
			System.out.println("UnderWeight");
		} else if (BMIIndex >= 18.5 && BMIIndex < 25) {
			System.out.println("Normal Weight");
		} else if (BMIIndex >= 25 && BMIIndex < 30) {
			System.out.println("Overweight");
		} else if (BMIIndex >= 30) {
			System.out.println("Obese");
		}

	}

	void printRecord() {

		System.out.printf("BMI Index is	: %.2f", this.BMIIndex);
		System.out.println();

	}

}

public class BMI {

	public static void main(String[] args) {

		BMITracker bmi = new BMITracker();
		bmi.acceptRecord();
		bmi.calculateBMI();
		bmi.printRecord();
		bmi.classifyBMI();

	}

}

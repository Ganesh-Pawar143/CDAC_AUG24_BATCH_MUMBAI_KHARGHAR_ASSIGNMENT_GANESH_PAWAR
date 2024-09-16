package org.assignment4;

public class Arithmatic {
	public static void main(String[] args) {
		int integerNumber = 10;
		float floatNumber = 5.5f;
		double doubleNumber = 20.5;

		// Addition
		double result1 = integerNumber + floatNumber;
		double result2 = floatNumber + doubleNumber;
		double result3 = integerNumber + doubleNumber;

		// Subtraction
		double result4 = doubleNumber - integerNumber;
		double result5 = floatNumber - doubleNumber;
		double result6 = integerNumber - floatNumber;

		// Multiplication
		double result7 = integerNumber * floatNumber;
		double result8 = floatNumber * doubleNumber;
		double result9 = integerNumber * doubleNumber;

		// Division
		double result10 = doubleNumber / integerNumber;
		double result11 = floatNumber / doubleNumber;
		double result12 = integerNumber / floatNumber;

		// Print results
		System.out.println("Addition Results:");
		System.out.println("int + float = " + result1);
		System.out.println("float + double = " + result2);
		System.out.println("int + double = " + result3);

		System.out.println("\nSubtraction Results:");
		System.out.println("double - int = " + result4);
		System.out.println("float - double = " + result5);
		System.out.println("int - float = " + result6);

		System.out.println("\nMultiplication Results:");
		System.out.println("int * float = " + result7);
		System.out.println("float * double = " + result8);
		System.out.println("int * double = " + result9);

		System.out.println("\nDivision Results:");
		System.out.println("double / int = " + result10);
		System.out.println("float / double = " + result11);
		System.out.println("int / float = " + result12);
	}
}

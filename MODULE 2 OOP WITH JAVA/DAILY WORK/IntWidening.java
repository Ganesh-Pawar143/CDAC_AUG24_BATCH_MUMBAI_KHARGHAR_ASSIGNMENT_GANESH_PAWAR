package org.assignment4;

public class IntWidening {
	public static void main(String[] args) {
		int number = 2345;

		double number2 = number;
		System.out.println("int to Double:" + number2);

		float number3 = number;
		System.out.println("int to Float : " + number3);

		String str = Integer.toString(number);
		System.out.println("Int to String :  " + str);
	}
}

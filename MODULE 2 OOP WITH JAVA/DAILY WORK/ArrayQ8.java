package org.Assignment6;

import java.util.Scanner;

public class ArrayQ8 {
	private int[] array;

	public ArrayQ8(int size) {
		array = new int[size];
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	public static void main(String[] args) {

		ArrayQ8 handler = new ArrayQ8(5);

		Scanner scanner = new Scanner(System.in);
		int[] inputArray = new int[5];
		System.out.println("Enter 5 elements:");
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = scanner.nextInt();
		}
		handler.setArray(inputArray);

		int[] array = handler.getArray();
		System.out.println("Array elements are:");
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
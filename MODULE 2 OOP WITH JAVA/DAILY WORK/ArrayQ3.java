package org.Assignment6;

import java.util.Scanner;

public class ArrayQ3 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int Size;
		System.out.print("Enter Size of Array: ");
		Size = sc.nextInt();
		int[] arr = new int[Size];

		ArrayQ3.acceptRecord(arr);
		ArrayQ3.MaxValue(arr);
		ArrayQ3.MinValue(arr);
	}

	public static void acceptRecord(int[] arr) {

		for (int index = 0; index < arr.length; ++index) {
			System.out.print("Enter Value of arr[" + index + "] :");
			arr[index] = sc.nextInt();

		}

	}

	public static void MaxValue(int[] arr) {
		int Max = arr[0];
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] > Max) {
				Max = arr[i];
			}
		}

		System.out.println("Maximum Value in Array is :" + Max);

	}

	public static void MinValue(int[] arr) {
		int Min = arr[0];
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] < Min) {
				Min = arr[i];
			}
		}

		System.out.println("Minimum Value in Array is :" + Min);

	}

}

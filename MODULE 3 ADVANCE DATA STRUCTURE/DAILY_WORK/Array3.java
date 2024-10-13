package org.example.array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size Of Array : ");
		int Size = sc.nextInt();

		int[] arr = new int[Size];

		System.out.println("Enter elements : ");
		for (int i = 0; i < Size; i++) {
			arr[i] = sc.nextInt();
		}

		double sum = 0;
		for (int num : arr) {
			sum = sum + num;

		}
		double avg = sum / Size;
		System.out.printf("Average : %.2d" + avg);

		for (int num1 : arr) {
			if (num1 > avg) {
				System.out.print(num1 + " ");
			}
		}

	}

}

package org.Assignment6;

import java.util.Scanner;

public class ArrayQ1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Default Value");
		for (int index : arr) {

			System.out.print(index + " ");

		}
		System.out.println();
		for (int index = 0; index < arr.length; ++index) {
			System.out.print("Enter arr[" + index + "]	:	");
			arr[index] = sc.nextInt();
		}

		System.out.println("Accpeted value ");
		for (int index : arr) {

			System.out.print(index + " ");
		}
		sc.close();
	}

}

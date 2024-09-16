package org.Assignment6;

import java.util.Scanner;

public class ArrayQ2 {
	public static void main(String[] args) {
		int [] arr=new int[5];
		ArrayQ2.acceptRecord(arr);
		ArrayQ2.printRecord(arr);
	}
	
	
	public static void acceptRecord(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < arr.length; ++index) {
			System.out.print("Enter Value of arr[" + index + "] :");
			arr[index] = sc.nextInt();

		}

	}

	public static void printRecord(int [] arr) {
		for (int index = 0; index < arr.length; ++index) {
			System.out.print(index + " 	");
		}
	}

}

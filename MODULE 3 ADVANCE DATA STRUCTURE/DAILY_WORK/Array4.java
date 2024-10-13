package org.example.array;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Size of Array: ");
		int Size=sc.nextInt();
		
		int [] arr= new int[Size];
		
		System.out.println("Enter elements : ");
		for (int i = 0; i < Size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int num: arr) {
			if (num>0) {
				
			}
		}
	}

}

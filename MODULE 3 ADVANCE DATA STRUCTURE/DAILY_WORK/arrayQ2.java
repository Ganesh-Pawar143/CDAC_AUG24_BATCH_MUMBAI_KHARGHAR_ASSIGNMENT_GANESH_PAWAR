package org.example.array;

import java.util.Scanner;

public class arrayQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("take array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
      
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
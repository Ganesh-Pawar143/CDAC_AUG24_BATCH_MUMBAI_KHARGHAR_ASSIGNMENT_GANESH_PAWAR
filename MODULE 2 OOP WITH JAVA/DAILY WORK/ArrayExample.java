package org.Assignment6;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];

        // Traverse the array to print the default values
        System.out.println("Default values of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Accept records from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers to update the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print the updated values of the array
        System.out.println("Updated values of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        scanner.close();
    }
}

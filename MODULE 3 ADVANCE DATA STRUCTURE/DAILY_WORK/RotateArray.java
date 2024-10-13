package EXTRA;

import java.util.Scanner;
public class RotateArray {

    // Function to perform left rotation on the array
    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotatedArray = new int[n];
        
        // Copy elements to their new positions
        for (int i = 0; i < n; i++) {
            rotatedArray[i] = a[(i + d) % n];
        }
        
        return rotatedArray;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number of rotations: ");
        int d = scanner.nextInt();
        
        int[] result = rotLeft(array, d);
        
        // Print the rotated array
        System.out.println("Rotated array:");
        for (int i : result) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
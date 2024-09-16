package org.Assignment6;

import java.util.Scanner;

public class ArrayQ7 {
    private int[] array;

    
    public ArrayQ7(int size) {
        array = new int[size];
    }

   
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    
    public void printRecord() {
        System.out.println("Array elements are:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       
        ArrayQ7 handler = new ArrayQ7(5);

      
        handler.acceptRecord();

     
        handler.printRecord();
    }
}

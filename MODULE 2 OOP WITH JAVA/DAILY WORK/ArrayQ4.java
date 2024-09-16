package org.Assignment6;

import java.util.Scanner;

import java.util.Arrays;

public class ArrayQ4 {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);       
       
        int j = 0;
    
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i]; 
            }
        }      
        
        return Arrays.copyOf(arr, j + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] result = removeDuplicates(arr);
        
       
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}
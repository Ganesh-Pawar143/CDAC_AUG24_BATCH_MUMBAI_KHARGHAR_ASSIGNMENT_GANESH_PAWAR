package org.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindowMedian {
    public static int findMedian(int[] window) {
        Arrays.sort(window); 
        int median = window[window.length / 2]; 
        return median;
    }
    public static int[] slidingWindowMedian(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1]; 
        int[] window = new int[k]; 

        for (int i = 0; i <= nums.length - k; i++) {

            for (int j = 0; j < k; j++) {
                window[j] = nums[i + j];
            }
            result[i] = findMedian(window);
        }

        return result;
    }
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        System.out.print("take array size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
      
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.print("Enter Window Size: ");
        int k = sc.nextInt(); 
        int[] medians = slidingWindowMedian(nums, k); 

        
        System.out.println("Result array: " + Arrays.toString(medians));
        sc.close();
    }
}

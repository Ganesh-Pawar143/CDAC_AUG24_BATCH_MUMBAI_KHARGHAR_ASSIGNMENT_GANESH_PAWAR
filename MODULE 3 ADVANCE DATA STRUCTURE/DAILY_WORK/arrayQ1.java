package org.example.array;

import java.util.Scanner;

public class arrayQ1{
    public static int euclid(int x, int y){
        while (y != 0){
            int temp = x; 
            x = y; 
            y = temp % y; 
        }
        return Math.abs(x); 
    }
    
    public static void main(String[] args) {
        System.out.println("Result: " + euclid(48, 24));
        System.out.println("Result: " + euclid(125463, 9658));
    }
}
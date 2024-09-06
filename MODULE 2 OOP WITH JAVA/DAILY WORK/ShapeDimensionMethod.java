package org.example;

import java.util.Scanner;



public class ShapeDimensionMethod {
	
		Scanner sc=new Scanner(System.in);
		
		void Circle() {
			float radius;
			System.out.print("\n Enter Radius for Circle: ");
			radius=sc.nextFloat();
			float Ciarea=( (float)3.14 * radius * radius );
			System.out.println("\n Area of Circle for Radius "+ radius +" is " + Ciarea);
				
		}
		
		void Square() {
			float Length;
			System.out.print("\nEnter Length of Square : ");
			Length=sc.nextFloat();
			float SqArea=(Length * Length);
			System.out.println("\n Area of Square for length "+ Length +" is " + SqArea);
			
		}
		
		void Rectangle() {
			float Length1, Breadth;
			System.out.print("\nEnter Length of Rectangle : " );
			Length1=sc.nextFloat();
			System.out.print("\n Enter Breadth of Rectangle: ");
			Breadth=sc.nextFloat();
			float RecArea=(Length1 * Breadth);
			System.out.println("\n Area of Rectangle for length "+ Length1 +" and Breadth " + Breadth + " is: " + RecArea);
			
		}
		
		void Tringle() {
			System.out.print("\n Enter Length of Tringle:" );
			float Base, Height;
			Base=sc.nextFloat();
			System.out.print("\n Enter Height of Tringle: ");
			Height=sc.nextFloat();
			float TriArea=( (float)0.5 * Base * Height);
			System.out.print("\n Area of Tringle for Base "+ Base + " and Height "+ Height + " is: " + TriArea);
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program2 sh=new program2();
		Scanner sc=new Scanner(System.in);
		int Choice;
		System.out.println("Select option ");
		System.out.println("1. Circle");
		System.out.println("2. Square ");
		System.out.println ("3. Rectangle" );
		System.out.println ("4. Triangle ");
		System.out.print("Enter your Choice: ");
		Choice =sc.nextInt();
		System.out.println();
		switch (Choice){
			case 1:
				sh.Circle();
				break;
			
			
			case 2:
				sh.Square();
				break;
			
			
			case 3:
				sh.Rectangle();
				break;
				
			
			
			case 4:
				sh.Tringle();
				break;
			
			default :
				System.out.println("\n Please Enter Valid Choice. ");
		}
		sc.close();

	}
	

}

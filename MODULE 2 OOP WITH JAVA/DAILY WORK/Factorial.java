package pkgjava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number1: ");
		a=sc.nextInt();
		System.out.println("Number1 is: " + a);
		int fact=1;
		for (int i=1; i<=a;i++){
			
			fact=fact*i;
			
	
		}
		
		System.out.println("Factorial of all numbers is:"+ fact);

	}

}

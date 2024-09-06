package pkgjava;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		int num1,num2;
		System.out.println("Enter Number : ");
		num1=sc.nextInt();
	
		for (int i=2;i<num1;i++) {
			
			if (num1%i==0) {
				System.out.println(num1+" is not a Prime Number.");
				
			}else {
				System.out.println(num1+" is a Prime Number.");
				
			}
		
		
		
		
		}
		

	}

}

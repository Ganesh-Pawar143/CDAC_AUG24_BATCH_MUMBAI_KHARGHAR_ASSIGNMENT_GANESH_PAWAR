
import java.util.Scanner;

public class ArmstrongForLoop4 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//armstroong number 
	//153= 1*1*1+5*5*5+3*3*3
	
	Scanner sc=new Scanner(System.in);
	
	int num2; 
	System.out.println("Enter a Number : " );
	num2=sc.nextInt();
	
	for (int j = 1; j<=num2; j++) {
		
		int len1= String.valueOf(j).length();
		
		double sum=0;
		int indig = j; 
		for (int i =1 ; i<=len1 ; i++ ) {
			
			int dig,remdig;
			double mult;
			
			
			dig= indig % 10;
			mult= Math.pow(dig,len1);
			sum=sum+mult; 
			remdig=indig/10; 
			indig=remdig;
			
		}
		
		if (sum==j) {
			System.out.println(j+"  is an Armstrong Number. ");
			
		} else {
			continue;
			
		}
	}
		
	}
	


}
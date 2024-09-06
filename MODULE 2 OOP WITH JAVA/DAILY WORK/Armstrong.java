package pkgjava;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//armstroong number 
		//153= 1*1*1+5*5*5+3*3*3
		
		Scanner sc=new Scanner(System.in);
		
		int num1; //153
		System.out.println("Enter a Number : " );
		num1=sc.nextInt();
		
		int len1= String.valueOf(num1).length();
		
		double sum=0;
		int indig = num1; //1-153,
		for (int i =1 ; i<=len1 ; i++ ) {
			
			int dig,remdig;
			double mult;
			
			dig= indig % 10; //1-3,
			mult=dig*dig*dig;//1-27,
			sum=sum+mult; //27
			remdig=indig/10; //1-15
			indig=remdig;
			
		}
		
		if (sum==num1) {
			System.out.println(num1+"  is an Armstrong Number. ");
		} else {
			System.out.println(num1+" is not an Armstrong Number ");
			
		}
		

	}

}

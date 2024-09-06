import java.util.Scanner;

public class LeapYearSwitchCase {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int year;
		System.out.println("Enter Year");
		year=sc.nextInt();
		
		switch (year % 400 ) {
			case 0:
				System.out.println(year + " is Leap Year.");
				break;
				
			default:
				switch (year % 100) {
					case 0:
						System.out.println(year + " is Leap Year.");	
						break;
					default:
						switch (year % 4 ){
							case 0:
								System.out.println(year + " is Leap Year.");
								break;
							default :
							
								System.out.println(year + " is not  Leap Year.");
						}
				}
		}
		
		
	}
	
	
}
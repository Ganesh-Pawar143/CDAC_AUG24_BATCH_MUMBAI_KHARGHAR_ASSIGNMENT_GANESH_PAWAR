import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int Month;
		System.out.print("Enter Month :");
		Month=sc.nextInt();
		
		switch (Month) {
			case 12,1,2 :
				System.out.println("Season is Winter");
				break;
			
			case 3,4,5:
				System.out.println("Season is Spring");
				break;
				
			case 6,7,8 :
				System.out.println("Season is Summer");
				break;
				
			case 9,10,11: 
				System.out.println("Season is Autumn");
				break;
				
				
			default :
				System.out.println("Please Enter Valid Month");
		}
		
	}
}
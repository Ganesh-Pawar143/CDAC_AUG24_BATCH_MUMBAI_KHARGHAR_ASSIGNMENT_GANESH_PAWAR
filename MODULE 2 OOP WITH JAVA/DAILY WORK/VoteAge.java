import java.util.Scanner;

public class VoteAge {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int Age;
		System.out.print("Enter Age :");
		Age=sc.nextInt();
		
		if (Age >= 18){
			System.out.println("Eligible for Voting");
		} else if (Age > 0 && Age < 18){
			System.out.println("Not eligible for Voting ");
		} else {
			System.out.println("Please Enter Valid Details");
		}
		
		
	}
}
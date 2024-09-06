import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		double weight, heightFeet, heightMeter;
		System.out.print("Enter Weight in kg :");
		weight=sc.nextDouble();
		
		System.out.print("Enter height in Feet:");
		heightFeet=sc.nextDouble();
		
		heightMeter = (heightFeet * 0.3048);
		
		
		double BMI;
		
		BMI = (weight/ (heightMeter * heightMeter));
		
		System.out.printf("Body Mass Index is : %.2f ", BMI);
		System.out.println();
		
		if ( BMI >=25 ){
			System.out.println("You are in Overweight");
		} else if (BMI < 25 && BMI >= 18.5){
			System.out.println("you are in NormalWeight");
		} else {
			System.out.println("you are in UnderWeight");
		}
		
	}
}
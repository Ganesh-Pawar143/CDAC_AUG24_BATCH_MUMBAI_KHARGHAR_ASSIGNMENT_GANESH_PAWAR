import java.util.Scanner;

public class pyramid	 {
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner (System.in);
		
		int num;
		System.out.print("Enter Number  :");
		num=sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
 
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }

       
            for (int k =1; k <=(i*2 - 1); k++) {
     
                if (k == 1 || k == (i * 2 - 1) || i == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

           
            System.out.println();
        }
		
	}
}
package org.package2;

import org.package1.A;

public class D extends A{
	public void f4( ) {
		//System.out.println("Num1	:	"+this.num1);//The field A.num1 is not visible
		
		//System.out.println("Num2	:	"+this.num2);//The field A.num2 is not visible
		
		System.out.println("Num3	:	"+this.num3); //OK
		
		System.out.println("Num4	:	"+this.num4); //OK
	}
}
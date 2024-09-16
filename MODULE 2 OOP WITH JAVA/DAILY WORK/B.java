package org.package1;

public class B extends A{
	public void f2( ) {
		//System.out.println("Num1	:	"+this.num1);//The field A.num1 is not visible
		System.out.println("Num2	:	" + this.num2);//OK
		System.out.println("Num3	:	" + this.num3);//OK
		System.out.println("Num4	:	" + this.num4);//OK
	}
}
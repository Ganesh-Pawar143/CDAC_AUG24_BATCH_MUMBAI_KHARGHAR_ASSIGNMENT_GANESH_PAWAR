package org.package1;

public class A {
	private int num1 = 10;
	int num2 = 20;
	protected int num3 = 30;
	public int num4 = 40;
	
	public void f1() {
		System.out.println("Num1	:	" + this.num1);//OK
		System.out.println("Num2	:	" + this.num2);//OK
		System.out.println("Num3	:	" + this.num3);//OK
		System.out.println("Num4	:	" + this.num4);//OK
	}
}
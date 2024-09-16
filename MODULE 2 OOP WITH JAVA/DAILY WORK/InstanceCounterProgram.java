package org.Assignment5;

class InstanceCounter {
	private static int instanceCounterValue=0;
	public InstanceCounter() {
		
		instanceCounterValue++;
		
		
	}
	
	public static int getInstanceCounterValue() {
		return instanceCounterValue;
	}
}

public class InstanceCounterProgram{	
	
	public static void main(String[] args) {
		InstanceCounter IC1=new InstanceCounter();
		InstanceCounter IC2=new InstanceCounter();
		InstanceCounter IC3=new InstanceCounter();
		InstanceCounter IC4=new InstanceCounter();
		
		System.out.println("Instance Count is : "+ InstanceCounter.getInstanceCounterValue() );
	}
	
	

}

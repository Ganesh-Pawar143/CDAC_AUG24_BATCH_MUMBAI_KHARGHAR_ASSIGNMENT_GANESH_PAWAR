package org.inheritance.EngineQ5;

public class Test {
	public static void main(String[] args) {
		Vehicle car = new Car();

		car.startEngine();
		car.stopEngine();

		Vehicle motorcycle = new Motorcycle();
		motorcycle.startEngine();
		motorcycle.stopEngine();

	}

}

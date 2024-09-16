/* 1)	Create a base class Vehicle with attributes like make and year. Provide a constructor in Vehicle 
 * to initialize these attributes. Derive a class Car that has an additional attribute model and write a 
 * constructor that initializes make, year, and model. 
 * Write a program to create a Car object and display its details.  */

package org.inheritance.vehicleQ2;

public class Vehicle {
	private String make;
	private int year;

	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {

		return String.format("Vehicle Info \nmake=%s \nyear=%s", make, year);
	}

}

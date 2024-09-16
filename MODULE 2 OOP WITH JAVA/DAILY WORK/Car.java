package org.inheritance.vehicleQ2;

public class Car extends Vehicle{
	
	private String Model;

	public Car(String make, int year, String model) {
		super(make, year);
		Model = model;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nCar Model="+ this.getModel();
	}
	
	

}

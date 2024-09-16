package org.inheritance.AnimalQ3;

public class Dog extends Animal {

	private String Name;

	public Dog(String name) {
		super(name);
		this.Name = name;
	}

	public void bark() {
		System.out.println(Name + " is Barking");
	}

}

/* 3)	Create a base class Animal with attributes like name, and methods like eat() and sleep(). 
 * Create a subclass Dog that inherits from Animal and has an additional method bark(). 
 * Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog 
 * and calling their methods.  */

package org.inheritance.AnimalQ3;

public class Animal {

	private String Name;

	public Animal(String name) {
		Name = name;
	}

	public void eat() {
		System.out.println(Name + " is Eating.");
	}

	public void sleep() {
		System.out.println(Name + " is Sleeping");
	}

}

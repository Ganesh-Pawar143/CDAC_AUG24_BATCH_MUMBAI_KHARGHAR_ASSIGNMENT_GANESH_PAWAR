package org.inheritance.StudentqQ4;

import java.util.Scanner;

public class StudentTest {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Students students = new Students();
		System.out.print("Name:");
		students.setName(sc.nextLine());
		System.out.print("Roll No:");
		students.setRollNo(sc.nextInt());
		System.out.print("Age:");
		students.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("Course:");
		students.setCourse(sc.nextLine());
		sc.close();

		System.out.println(students.toString());

	}

}

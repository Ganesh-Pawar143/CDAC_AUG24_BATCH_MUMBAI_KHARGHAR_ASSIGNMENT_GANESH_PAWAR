package org.inheritance.StudentqQ4;

public class Students {

	String Name;
	int rollNo;
	int age;
	String Course;

	public Students() {
		this("", 0, 0, "");

	}

	public Students(String name, int rollNo, int age, String course) {
		Name = name;
		this.rollNo = rollNo;
		this.age = age;
		Course = course;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	@Override
	public String toString() {
		return String.format("Students Details : \nName=	%s \nrollNo=	%s \nage=	%s \nCourse=	%s", Name,
				rollNo, age, Course);
	}

}

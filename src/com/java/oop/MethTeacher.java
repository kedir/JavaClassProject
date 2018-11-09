package com.java.oop;

public class MethTeacher extends Teacher {
	public MethTeacher(String designarion, String nameOfSchool) {
		super(designarion, nameOfSchool);
	}

	public static void main(String[] args) {
		MethTeacher obj = new MethTeacher("Math teacher", "abc");
		obj.does();
		
		
	}

}

class Teacher {
	String designarion = "teacher";
	String nameOfSchool = "XYZ";

	void does() {
		System.out.println("Teaching");
		 
	}

	public Teacher(String designarion, String nameOfSchool) {
		super();
		this.designarion = designarion;
		this.nameOfSchool = nameOfSchool;
	}

}

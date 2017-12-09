package com.nag.designPatterns.TransferObject;

public class TransferObjectMain {

	public static void main(String[] args) {
		StudentBO studentObject = new StudentBO();
		for(StudentVO student: studentObject.getAllStudents()) {
			System.out.println(student.getRollNo());
		}
	}
	
}

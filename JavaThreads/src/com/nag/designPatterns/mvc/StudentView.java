package com.nag.designPatterns.mvc;

public class StudentView {

	public void printStudentDetails(String studentName, int studentRollNo){
		System.out.println("Student: ");
		System.out.println("Student Name: "+studentName);
		System.out.println("Student RollNo: "+studentRollNo);
	}
}

package com.nag.designPatterns.mvc;

import java.util.Scanner;

public class MVCTest {

	public static void main(String[] args) {
		
		
		StudentModel Model = retreiveDataFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(Model, view);
			controller.updateView();
			
		
	}
	
	private static StudentModel retreiveDataFromDatabase(){	
	StudentModel model = new StudentModel();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Student Name: ");
	model.setName((sc.next()));
	System.out.println("Enter the student RollNo: ");
	model.setRollNo(sc.nextInt());

	return model;
	}
}

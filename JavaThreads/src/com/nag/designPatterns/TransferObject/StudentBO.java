package com.nag.designPatterns.TransferObject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

	List<StudentVO> students;
	
	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Ramesh",0);
		StudentVO student2 = new StudentVO("Suresh",1);
		students.add(student1);
		students.add(student2);
	}
	
	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No. "+student.getRollNo()+" , deleted from database");
	}
	
	public List<StudentVO> getStudents() {
		return students;
	}
	
	public List<StudentVO> getAllStudents(){
		return students;
	}
	
	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
	}
}

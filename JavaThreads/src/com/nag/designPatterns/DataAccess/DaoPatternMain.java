package com.nag.designPatterns.DataAccess;

public class DaoPatternMain {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		
		for(Student student: studentDao.getAllStudents()){
			System.out.println("Student: [Roll NO: "+student.getRollNo()+", Name: "+student.getName());
		}
	
		Student student = studentDao.getAllStudents().get(1);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		studentDao.getStudent(0);	
		System.out.println("Student: [Roll No: "+student.getRollNo()+", Name"+student.getName());
	}
}

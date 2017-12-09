package com.JavaConcepts.General;

public class JavaReflection {

	public static void main(String[] args) {
		Class s = boolean.class;
		System.out.println(s.getName());
		
		Class s1 = JavaReflection.class;
		System.out.println(s1.getName());
		
	}
}

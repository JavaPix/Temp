package com.JavaConcepts.sampleQuestion;

public class Immutable {

	// Immutable java
	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";

		System.out.println(s1 == s2);

		String s3 = new String("JAVA");
		String s4 = new String("JAVA");
		System.out.println(s3 == s4);
	}
}

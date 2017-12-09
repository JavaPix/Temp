package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class ProvidedNumbers {

	// check whether the user has provided the input or not.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		String str = sc.nextLine();
		boolean isTrue = true;
		try {
			int i = Integer.parseInt(str);
		} catch (Exception ex) {
			isTrue = false;
		}
		if (isTrue) {
			System.out.println("The user has provide the numbers");
		} else {
			System.out.println("The user has not provided the numbers");
		}
	}
}

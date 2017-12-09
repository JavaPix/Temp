package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class RemoveVowels {

	// removing all vowel in the string
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String strval = sc.next();
		String val = strval.replaceAll("[AEIOUaeiou]", "");
		System.out.println("Removing the vowels: " + val);
	}

}

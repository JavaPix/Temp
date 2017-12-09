package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class OccuranceOfParticularChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String strVal = sc.nextLine();
		System.out.println("Enter the particular char: ");
		char ch = sc.next().charAt(0);
		occuranceOfChar(strVal, ch);
	}
	
	public static void occuranceOfChar(String strVal, char ch) {
		int charCount = 0;
		for(int i=0;i<strVal.length();i++) {
			if(strVal.charAt(i)==ch) {
				charCount++;
			}
		}
		System.out.println("count of occurance of character "+ch+" on the string: "+charCount);
	}
	
	
}

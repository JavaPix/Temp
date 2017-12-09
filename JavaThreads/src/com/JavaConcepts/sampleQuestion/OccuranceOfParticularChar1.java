package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class OccuranceOfParticularChar1 {

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
		for (char chr : strVal.toCharArray()) {
			if(chr==ch){
				charCount++;
			}
		}
		System.out.println("count of occurance of character "+ch+" on the string: "+charCount);
	}
}

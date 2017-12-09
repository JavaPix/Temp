package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class LowerUpperCase {

	// percentage of lowercase, uppercase, special characters in string
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String strVal = sc.nextLine();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int isDigitCount = 0;
		int othersCount = 0;
		int totalCharacters = strVal.length();
		for (int i = 0; i < strVal.length(); i++) {
			char ch = strVal.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				isDigitCount++;
			} else {
				othersCount++;
			}
		}
		double upperCasePercentage = (upperCaseCount * 100) / totalCharacters;
		double lowerCaseCountPercentage = (lowerCaseCount * 100) / totalCharacters;
		double isDigitCountPercentage = (isDigitCount * 100) / totalCharacters;
		double othersCountPercentage = (othersCount * 100) / totalCharacters;

		System.out.println("uppercase percentage: " + (upperCasePercentage));
		System.out.println("lowecase percentage: " + lowerCaseCountPercentage);
		System.out.println("digit percentage: " + isDigitCountPercentage);
		System.out.println("Special characters percentage: " + othersCountPercentage);

	}
}

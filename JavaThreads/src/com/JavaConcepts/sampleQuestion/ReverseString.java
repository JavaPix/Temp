package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class ReverseString {

	// reverse each letter of the word in the string
	public static void main(String[] args) {
		System.out.println("Enter the string to be reversed: ");
		Scanner sc = new Scanner(System.in);
		String strVal = sc.nextLine();
		String[] valChar = strVal.split(" ");
		String reverseStrings = "";
		for (int i = 0; i < valChar.length; i++) {
			String words = valChar[i];
			String reverseWord = "";
			for (int j = words.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + words.charAt(j);
			}
			reverseStrings = reverseStrings + reverseWord + " ";
		}
		System.out.println(strVal);
		System.out.println(reverseStrings);
	}
}

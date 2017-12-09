package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class RomanEquivalent {

	// Roman equivalent of a decimal number:
	public static void main(String[] args) {
		String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] decimal = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int num = sc.nextInt();
		int temp = num;
		String roman = "";
		for (int i = 0; i < 13; i++) {
			while (num >= decimal[i]) {
				num = num - decimal[i];
				roman = roman + romanSymbols[i];
			}
		}

		System.out.println("Roman equivalent of " + num + " is: " + roman);
	}
}

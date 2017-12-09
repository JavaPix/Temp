package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class DecimalToOctal {

	// decimal to octal
	public static void main(String[] args) {
		System.out.println("Enter the Decimal Number: ");
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		int temp = decimal;
		StringBuilder octal = new StringBuilder();
		int tempval = 0;
		while (temp > 0) {
			tempval = temp % 8;
			octal.append(tempval);
			temp = temp / 8;
		}
		StringBuilder oct = octal.reverse();
		System.out.println("the octal equivalent of the " + decimal + " is : " + oct);
	}
}

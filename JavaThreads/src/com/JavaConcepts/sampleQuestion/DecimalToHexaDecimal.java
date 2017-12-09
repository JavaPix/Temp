package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	// decimal to hexadecimal
	public static void main(String[] args) {
		System.out.println("Enter the Decimal Number: ");
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		int temp = decimal;
		StringBuilder hexaDecimal = new StringBuilder();
		int tempval = 0;
		char hexaDecimals[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (temp > 0) {
			tempval = temp%16;
			hexaDecimal.append(hexaDecimals[tempval]);
			temp = temp / 16;
		}
		StringBuilder hexaDec = hexaDecimal.reverse();
		System.out.println("the hexaDecimal equivalent of the " + decimal + " is : " + hexaDec);
	}
}

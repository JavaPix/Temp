package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class DecimalToBinary {

	// decimal to binary
	public static void main(String[] args) {
		System.out.println("Enter the Decimal Number: ");
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		int temp = decimal;
		String binary = "";
		int tempval = 0;
		while (temp != 0) {
			tempval = temp % 2;
			binary = binary + tempval;
			temp = temp / 2;
		}
		System.out.println("the binary equivalent of the " + decimal + " is : " + binary);
	}
}

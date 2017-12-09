package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class BinaryNumber {

	// Check whether the given number is binary or not.
	public static void main(String[] args) {
		System.out.println("Enter the number with binary or not? ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		boolean isBinary = true;
		while (temp != 0) {
			int tempVal = temp%10;
			if (tempVal > 1) {
				isBinary = false;
				break;
			} else {
				temp = temp / 10;
			}
		}
		if (isBinary) {
			System.out.println("The given number is binary");
		} else {
			System.out.println("The given number is not binary");
		}
	}
}

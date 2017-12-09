package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class AllDigitsNum {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum=0;
		int tempNumber = number;
		while(tempNumber!=0){
			int lastDigit = tempNumber%10;
			sum = sum+lastDigit;
			tempNumber=tempNumber/10;
		}
		System.out.println("Sum of a number is: "+sum);
	}
}

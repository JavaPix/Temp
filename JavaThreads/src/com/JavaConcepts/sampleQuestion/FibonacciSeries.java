package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for fibonacci: ");
		int val = sc.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		int thirdTerm = 0;
		while (thirdTerm < val) {
			thirdTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}
		if (thirdTerm == val) {
			System.out.println("Number belongs to fibonacci series");
		} else {
			System.out.println("Number does not belongs to fibonacci series");
		}
	}
}

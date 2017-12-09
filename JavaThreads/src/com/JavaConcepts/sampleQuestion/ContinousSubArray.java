package com.JavaConcepts.sampleQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ContinousSubArray {

	// Program to find the continous sub array in array whose sum is equal to a
	// number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the array of numbers: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arrNum = new int[n];
		for (int i = 0; i < n; i++) {
			arrNum[i] = sc.nextInt();
		}
		int sum = arrNum[0];
		int start = 0;
		for (int i = 1; i < arrNum.length; i++) {
			sum = sum + arrNum[i];
			while (sum > num && start <= i - 1) {
				sum = sum - arrNum[start];
				start++;
			}
			if (sum == num) {
				System.out.println(
						"Continous sub array of " + Arrays.toString(arrNum) + " whose sum is " + num + " is: ");
				for (int j = start; j <= i; j++) {
					System.out.print(arrNum[j] + " ");
				}
				System.out.println();
			}
		}
	}
}

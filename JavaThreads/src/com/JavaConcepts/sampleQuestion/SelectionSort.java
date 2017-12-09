package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class SelectionSort {

	// selection sort
	public static void main(String[] args) {
		System.out.println("Selection sort");
		System.out.println("Enter the range of numbers: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the values: ");
		int[] val = new int[n];
		for (int i = 0; i < n; i++) {
			val[i] = sc.nextInt();
		}
		int pos, temp;
		for (int i = 0; i < val.length; i++) {
			pos = i;
			for (int j = i + 1; j < val.length; j++) {
				if (val[j] < val[i]) {
					pos = j;
				}
			}
			temp = val[i];
			val[i] = val[pos];
			val[pos] = temp;
		}
		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}
	}
}

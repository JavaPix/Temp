package com.JavaConcepts.sampleQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		char[] chars = original.toCharArray();
		Arrays.sort(chars);
		
		String sorted = new String(chars);
		System.out.println(sorted);
	}
}

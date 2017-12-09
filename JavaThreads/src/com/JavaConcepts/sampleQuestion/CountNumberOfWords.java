package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strVal = sc.nextLine();
		System.out.println(strVal.split(" ").length);
	}
}


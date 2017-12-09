package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class MissingNumberInArray1 {

	public static int getMissingNumber2(int[] numbers, int count){
		int expectedSum = count*((count+1)/2);
		int actualSum = 0;
		for(int i:numbers){
			actualSum+=i;
		}
		return expectedSum-actualSum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the count: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println("Enter Missing Numbers: ");
		int[] numbers = new int[count];
		for(int i=0; i<count; i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.println(getMissingNumber2(numbers, count));
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class MaximumMinimumArrayDem {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		largestAndSmallest(num);
	}
	
	public static void largestAndSmallest(int[] numbers){
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int number: numbers){
			if(number>largest){
				largest=number;
			}else if(number<smallest){
				smallest=number;
			}
		}
		
	}
}

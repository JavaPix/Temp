package com.JavaConcepts.sampleQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of an array: ");
		int n = sc.nextInt();
		System.out.println("Enter the numbers: ");
		int[] arrNum = new int[n]; 
		for(int i=0;i<n;i++){
			int val = sc.nextInt();
			arrNum[i]=val;
		}
		Arrays.sort(arrNum);
		System.out.println("Second largest number is : "+arrNum[arrNum.length-2]);
	}
	
}

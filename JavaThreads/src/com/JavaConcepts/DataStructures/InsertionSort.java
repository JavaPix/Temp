package com.JavaConcepts.DataStructures;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of the number: ");
		int range = sc.nextInt();
		System.out.println("Enter Numbers: ");
		int[] arrNum = new int[range];
		for(int i=0; i<range; i++) {
			arrNum[i]=sc.nextInt();
		}
		for(int j=1;j<range;j++) {
			int key = arrNum[j];
			int i=j-1;
			while((i>-1)&&(arrNum[i]>key)) {
				arrNum[i+1]=arrNum[i];
				i--;
			}
			arrNum[i+1]=key;
		}
		for(int i=0;i<range;i++) {
			System.out.println(arrNum[i]);
		}
	}
}

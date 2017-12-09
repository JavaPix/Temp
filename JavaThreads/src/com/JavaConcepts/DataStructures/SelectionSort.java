package com.JavaConcepts.DataStructures;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of the number: ");
		int range = sc.nextInt();
		System.out.println("Enter Numbers: ");
		int[] arrNum = new int[range];
		for(int i=0; i<range; i++) {
			arrNum[i]=sc.nextInt();
		}
		for(int i=0;i<range;i++) {
			int index = i;
			for(int j=i+1; j<range; j++) {
				if(arrNum[j]<arrNum[index]) {
					index=j;
				}
			}
			int temp = arrNum[index];
			arrNum[index]=arrNum[i];
			arrNum[i]=temp;
		}
		for(int i=0;i<range;i++) {
			System.out.println(arrNum[i]);
		}
	}
}

package com.JavaConcepts.DataStructures;

import java.util.Scanner;

public class BubbleSort {

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
			for(int j=1; j<(range-i); j++) {
				if(arrNum[j-1]>arrNum[j]) {
					int temp = arrNum[j-1];
					arrNum[j-1]=arrNum[j];
					arrNum[j]=temp;
				}
			}
		}
		for(int i=0;i<arrNum.length;i++) {
			System.out.println(arrNum[i]);
		}
	}
}

package com.JavaConcepts.DataStructures;

import java.util.Scanner;

public class BinarySearchValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of the number: ");
		int range = sc.nextInt();
		System.out.println("Enter Numbers: ");
		int[] arrNum = new int[range];
		for(int i=0; i<range; i++) {
			arrNum[i]=sc.nextInt();
		}
		System.out.println("Enter the value to be searched: ");
		int numSearch = sc.nextInt();
		int lowIndex = 0;
		int highIndex = range-1;
		while(lowIndex<=highIndex) {
			int middleIndex = (highIndex+lowIndex)/2;
			if(arrNum[middleIndex]<numSearch) {
				lowIndex = middleIndex+1;
			}else if(arrNum[middleIndex]>numSearch) {
				highIndex = middleIndex-1;
			}else {
				System.out.println("Found at "+middleIndex);
				lowIndex = middleIndex+1;
			}
		}
	}
}

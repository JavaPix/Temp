package com.JavaConcepts.DataStructures;

import java.util.Scanner;

public class LinearSearchValue {

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
		boolean isFound = false;
		for(int i=0; i<range; i++) {
			if(arrNum[i]==numSearch) {
				isFound = true;
				System.out.println("Found at "+i);
			}
		}
		if(!isFound) {
			System.out.println("Not found");
		}
	}
}

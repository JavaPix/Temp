package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numOfRows = sc.nextInt();
		int rowCount = 1;
		for(int i=numOfRows; i>0; i--){
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=rowCount; j++){
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		}
	}
	
}

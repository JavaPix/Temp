package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class AddingDiagonalElements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows in matrix: ");
		int rows = scan.nextInt();
		System.out.println("Enter the number of cols in matrix: ");
		int cols = scan.nextInt();
		int[][] matrix = new int[rows][cols];
		System.out.println("Enter the elements in the matrix: ");
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				matrix[i][j] = scan.nextInt(); 
			}
		}
		int sumOfDiagonal1=0;
		for(int i=0, j=0; i<rows && j<cols; i++, j++){
			sumOfDiagonal1 = sumOfDiagonal1+matrix[i][j];
		}
		
		int sumOfDiagonal2=0;
		for(int i=0, j=cols-1; i<rows && j>=0; i++, j--){
			sumOfDiagonal2 = sumOfDiagonal2+matrix[i][j]; 
		}
		System.out.println(sumOfDiagonal1);
		System.out.println(sumOfDiagonal2);
		System.out.println("Sum of diagonal elements of matrix is : "+ (sumOfDiagonal1+sumOfDiagonal2));
	
	}
}

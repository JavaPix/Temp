package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		System.out.println("Matrix addition: ");
		System.out.println("Enter the first matrix rows range: ");
		Scanner sc = new Scanner(System.in);
		int rowFirst = sc.nextInt();
		System.out.println("Enter the first matrix columns range: ");
		int columnFirst = sc.nextInt();
		System.out.println("Enter the Second matrix rows range: ");
		int rowSecond = sc.nextInt();
		System.out.println("Enter the Second matrix columns range: ");
		int columnSecond = sc.nextInt();
		if(rowFirst==rowSecond && columnFirst==columnSecond){
			int[][] a = new int[rowFirst][columnFirst];
			int[][] b = new int[rowSecond][columnSecond];
			int[][] c = new int[rowSecond][columnSecond];
			
			System.out.println("Enter the first matrix numbers: ");
			for(int i=0;i<rowFirst;i++){
				for(int j=0;j<columnFirst; j++){
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the second matrix numbers: ");
			for(int i=0;i<rowSecond;i++){
				for(int j=0;j<columnSecond;j++){
					b[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<rowFirst;i++){
				for(int j=0;j<columnFirst;j++){
					c[i][j] = a[i][j]+b[i][j];
				}
			}
			System.out.println("Addition of Matrix: ");
			for(int i=0; i<rowFirst; i++){
				for(int j=0; j<columnFirst; j++){
					System.out.print(c[i][j]+",");
				}
				System.out.println();
			}
		}else{
			System.out.println("Matrix addition could not be performed.");
		}
	}
}

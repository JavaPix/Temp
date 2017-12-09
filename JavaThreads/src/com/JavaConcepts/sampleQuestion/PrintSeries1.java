package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

//Print Series 1, 11, 111, 1111……..n terms in Java
public class PrintSeries1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = scan.nextInt();
		int s=0;
		for(int i=1; i<=n; i++){
			s = s*10+1;
			System.out.println(s+"");
		}
	
	}
}

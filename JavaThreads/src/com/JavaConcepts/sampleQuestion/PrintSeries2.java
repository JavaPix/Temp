package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

//Print Series 1, 12, 123, 1234.....n in Java
public class PrintSeries2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = scan.nextInt();
		int s=0;
		for(int i=1; i<=n; i++){
			s = s*10+i;
			System.out.println(s+"");
		}
	}
}

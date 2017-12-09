package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

//Print Series 2, -4, 6, -8,………n terms in Java
public class PrintSeries4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c, i=2, n;
		System.out.println("Enter the number of terms: ");
		n = scan.nextInt();
		System.out.println("\n");
		for(c=1; c<=n; c++, i+=2){
			if(i%4==0){
				System.out.println(-i+"");
			}else{
				System.out.println(i+"");
			}
		}
	}
}

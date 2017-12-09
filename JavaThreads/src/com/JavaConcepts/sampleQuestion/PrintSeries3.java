package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

//Print Series 1, -3, 5, -7.....n terms in Java.
public class PrintSeries3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = scan.nextInt();
		int i=1, f=1;
		for(int c=1; c<=n; c++){
			if(f%2==0){
				System.out.println(-i+"");
			}else{
				System.out.println(i+"");
			}
			i+=2;
			f++;
		}
	}
}

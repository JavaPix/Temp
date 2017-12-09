package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int i,m=0,flag=0;
		int n=sc.nextInt();
		m=n/2;
		for(i=2;i<=m;i++){
			if(n%i==0){
				System.out.println("Number not prime");
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Number  is prime");
	
	}
}

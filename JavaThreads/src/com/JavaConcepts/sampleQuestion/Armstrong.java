package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int c=0, a, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find the armstrong: ");
		int n = sc.nextInt();
		temp = n;
		while(n>0){
			a = n%10;
			n=n/10;
			c = c+(a*a*a);
		}
		if(temp==c){
			System.out.println("The given number "+temp+" is armstrong.");
		}else{
			System.out.println("The given number "+temp+" is not an armstrong.");
		}
	}
}

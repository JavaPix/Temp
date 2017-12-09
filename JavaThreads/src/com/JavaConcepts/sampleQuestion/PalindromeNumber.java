package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int r , sum=0, temp;
		int n=sc.nextInt();
		temp = n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}
}

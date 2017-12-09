package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int i,fact=1;
		System.out.println("Enter the number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		for(i=1;i<=number;i++){
			fact = fact*i; 
		}
		System.out.println("Factorial of "+number+" is: "+fact);
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check exen or odd");
		number = sc.nextInt();
		if((number/2)*2==number){
			System.out.println("even number");
		}else{
			System.out.println("odd number");
		}
	}
}

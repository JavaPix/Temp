package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class AdditionWithoutAdd {

	public static int addIterative(int a, int b){
		while(b!=0){
			int carry = (a&b);
			a = a^b;
			b = carry<<1;
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter first number: ");
		int num2 = sc.nextInt();
		System.out.println(addIterative(num1, num2));
	}
}

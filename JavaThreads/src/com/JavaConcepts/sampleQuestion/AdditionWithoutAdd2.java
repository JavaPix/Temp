package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class AdditionWithoutAdd2 {

	public static int addRecursive(int a, int b){
		if(b==0){
			return a;
		}
		int sum = a^b;
		int carry = (a&b)<<1;
		return addRecursive(sum,carry);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter first number: ");
		int num2 = sc.nextInt();
		System.out.println(addRecursive(num1, num2));
	}
}

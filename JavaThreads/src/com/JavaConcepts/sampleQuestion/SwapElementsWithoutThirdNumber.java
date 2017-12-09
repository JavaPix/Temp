package com.JavaConcepts.sampleQuestion;

public class SwapElementsWithoutThirdNumber {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("values before swapping");
		System.out.println("Value of num1: "+num1);
		System.out.println("Value of num2: "+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("values after swapping");
		System.out.println("Value of num1: "+num1);
		System.out.println("Value of num2: "+num2);
	}
}

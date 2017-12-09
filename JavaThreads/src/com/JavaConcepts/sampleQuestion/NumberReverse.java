package com.JavaConcepts.sampleQuestion;

public class NumberReverse {

	public int reverseNumber(int number){
		int reverse = 0;
		while(number!=0){
			reverse = (reverse*10)+(number%10);
			number = number/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		NumberReverse nr = new NumberReverse();
		int reversedNumber = nr.reverseNumber(123);
		System.out.println("Reversed Number"+ reversedNumber);
		
	}
	
}

package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result =  getSum(a,b);
		System.out.println(result);
	}
	
	public static int getSum(int a, int b){
		while(b!=0){
			int carry = (a & b);
			a = a^b;
			b = carry<<1;
		}
		return a;
	}
}

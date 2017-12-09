package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1; i<=n; i++){
			if(((i%5)==0) && ((i%7)==0)){
				System.out.println("fizzbuzz");
			}else if((i%5)==0){
				System.out.println("fizz");
			}else if((i%7)==0){
				System.out.println("buzz");
			}else{
				System.out.println(i);
			}
		}
	}
}

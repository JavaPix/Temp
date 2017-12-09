package com.JavaConcepts.sampleQuestion;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isTrue = isHappy(n);
		if(isTrue){
			System.out.println("Happy Number");
		}else{
			System.out.println("Not a Happy Number");
		}
	}
	
	public static boolean isHappy(int n){
		HashSet<Integer> set = new HashSet<Integer>();
		while(!set.contains(n)){
			set.add(n);
			n = getSum(n);
			if(n==1){
				return true;
			}
		}
		return false;
	}
	
	public static int getSum(int n){
		int sum = 0;
		while(n>0){
			sum+=(n%10)*(n%10);
			n=n/10;
		}
		return sum;
	}
}

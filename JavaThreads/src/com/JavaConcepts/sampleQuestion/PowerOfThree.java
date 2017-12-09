package com.JavaConcepts.sampleQuestion;

public class PowerOfThree {

	public static void main(String[] args) {
		boolean isTrue = isPowerOfThree(11);
		System.out.println(isTrue);
	}
	
	public static boolean isPowerOfThree(int n){
		if(n==1)
			return false;
		boolean result = false;
		
		while(n>0){
			int m = n%3;
			if(m==0){
				n=n/3;
				if(n==1){
					return false;
				}
			}else{
				return false;
			}
		}
		return result;
	}
}

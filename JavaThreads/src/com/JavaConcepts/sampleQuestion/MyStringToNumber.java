package com.JavaConcepts.sampleQuestion;

public class MyStringToNumber {

	public static int stringToNumber(String numbStr){
		char ch[] = numbStr.toCharArray();
		int sum=0;
		int zeroAscii = '0';
		for(char c : ch){
			int tmpAscii = c;
			sum = (sum*10)+(tmpAscii-zeroAscii);
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
			System.out.println("the number is : "+stringToNumber("1234567"));
	}
	
}

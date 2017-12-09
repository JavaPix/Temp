package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class NumberComplement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int complement = findComplement(scan.nextInt());
		System.out.println(complement);
	}
	
	public static int findComplement(int num){
		String binaryString = Integer.toBinaryString(num);
		String temp = "";
		for(char c: binaryString.toCharArray()){
			if(c=='1'){
				temp += "0";
			}else{
				temp += "1";
			}
		}
		int base = 2;
		int complement = Integer.parseInt(temp, base);
		return complement;
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		System.out.println("The reversed String is: ");
		reverse(word);
	}
	
	public static void reverse(String word){
		char[] chs = word.toCharArray();
		int i=0, j=chs.length-1;
		
		for(i=0;i<j;i++,j--){
			char t = chs[i];
			chs[i] = chs[j];
			chs[j] = t;
		}
		
		System.out.println(chs);
	}
}

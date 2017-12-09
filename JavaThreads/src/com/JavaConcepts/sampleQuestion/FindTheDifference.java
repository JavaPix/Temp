package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class FindTheDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String result = findTheDifference(s, t);
		System.out.println(result);
	}
	
	public static String findTheDifference(String str1, String str2){
		int index = str1.lastIndexOf(str2);
		if(index>-1){
			return str1.substring(str2.length());
		}
		return str1;
	}

}

package com.JavaConcepts.sampleQuestion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the space separated strings to find the duplicate elements: ");
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		Set<String> setStr = new HashSet<String>();
		for(String arr: strArr){
			if(setStr.add(arr.toLowerCase())==false){
				System.out.println("Found a duplicate element in the array: "+arr);
			}
		}
	}
}

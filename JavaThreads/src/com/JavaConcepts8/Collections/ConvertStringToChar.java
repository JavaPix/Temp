package com.JavaConcepts8.Collections;

public class ConvertStringToChar {

	public static void main(String[] args) {
		String strVal = "Nagarjun";
		strVal.chars().mapToObj(x->(char)x).forEach(System.out::println);	
	}
}

package com.JavaConcepts8.Collections;

import java.util.Arrays;

//check if String array contains a value:
public class ChkArrayVal1 {

	public static void main(String[] args) {
		String[] alphabet = {"A","B","C","D","E","F","G"};
		boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);
		System.out.println(result);
	}
}

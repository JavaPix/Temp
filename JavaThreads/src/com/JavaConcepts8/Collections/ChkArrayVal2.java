package com.JavaConcepts8.Collections;

import java.util.stream.IntStream;

//check if String array contains a value using IntStream
public class ChkArrayVal2 {

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		boolean result = IntStream.of(number).anyMatch(x->x==10);
		System.out.println(result);
	}
}

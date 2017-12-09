package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToList {

	public static void main(String[] args) {
		int[] number = {10,20,30,40,50,60,70,80,90,100};
		List<Integer> lst = Arrays.stream(number).boxed().collect(Collectors.toList());
		lst.forEach(System.out::println);
	}
}

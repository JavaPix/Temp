package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;

public class AllMatchStream {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Scala", "C", "C++", "LIsp");
		boolean anyStartsWithC = names.stream().allMatch((s) -> s.startsWith("C"));
		System.out.println(anyStartsWithC);
	}
}

package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Scala", "C", "C++", "LIsp");
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		System.out.println(names);
	}
}

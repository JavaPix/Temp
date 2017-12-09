package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreatingList {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		List<String> filtered = languages.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.printf("Original List: %s, filtered List: %s %n", languages, filtered);
	}
}

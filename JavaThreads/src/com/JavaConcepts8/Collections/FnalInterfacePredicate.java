package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FnalInterfacePredicate {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		filter(languages, (str) -> str.startsWith("J"));
		filter(languages, (str) -> str.endsWith("a"));
	}
	public static void filter(List<String> names, Predicate<String> condition) {
		for (String name : names) {
			if (condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}
}

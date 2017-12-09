package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CombingPredicate {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		Predicate<String> startsWithJ = (n) -> n.startsWith("J");
		Predicate<String> fourLetterWord = (n) -> n.length() == 4;

		languages.stream().filter(startsWithJ.and(fourLetterWord))
				.forEach((n) -> System.out.print("Name starts with 'J' and four letter long is: " + n));
	}
}

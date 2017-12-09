package com.JavaConcepts8.Collections;

import java.util.function.Predicate;

//Predicate functions
public class PredicateFunctions {

	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println(predicate.test("Java"));
		System.out.println(predicate.negate().test("Java"));
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		System.out.println(isEmpty);
		System.out.println(isNotEmpty);
	}
}

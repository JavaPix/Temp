package com.JavaConcepts8.Collections;

import java.util.function.Function;

//Function accept one argument and produce a result.
// Default methods can be used to chain multiple functions together
public class LambdaFunctions {

	public static void main(String[] args) {
		Function<String, Integer> toInteger = Integer::valueOf;
		Function<String, String> backToString = toInteger.andThen(String::valueOf);
		System.out.println(backToString.apply("123"));
	}
}

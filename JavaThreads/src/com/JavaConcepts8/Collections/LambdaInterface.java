package com.JavaConcepts8.Collections;

public class LambdaInterface {

	// We can use the arbitrary interfaces as lambda expressions as long as the
	// interface contains only one abstract method
	public static void main(String[] args) {
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);
	}

	@FunctionalInterface
	interface Converter<F, T> {
		T convert(F from);
	}
}

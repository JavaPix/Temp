package com.JavaConcepts8.Collections;

public class LambdaStaticMthd {

	// Method and constructor references with above interface example
	// using the static method reference
	public static void main(String[] args) {
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);
	}

	@FunctionalInterface
	interface Converter<F, T> {
		T convert(F from);
	}
}

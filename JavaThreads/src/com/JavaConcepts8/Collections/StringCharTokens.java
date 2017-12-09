package com.JavaConcepts8.Collections;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCharTokens {

	public static void main(String[] args) {
		IntStream stream = "1234_strings".chars();
		stream.forEach(System.out::println);
		//also
		Stream<String> stream1 = Stream.of("@1@2@3@".split("\\@"));
		stream1.forEach(System.out::println);
	}
}

package com.JavaConcepts8.Collections;

import java.util.stream.Stream;

//different ways of building the stream
//Using StreamOF values
public class StreamOfValues {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stream.forEach(System.out::println);
	}
}

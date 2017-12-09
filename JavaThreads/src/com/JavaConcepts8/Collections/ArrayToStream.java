package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		String[] array = {"Java","Scala","C","C++","Python"};
		Stream<String> stream = Arrays.stream(array);
		stream.forEach(s->System.out.println(s));
		Stream<String> stream1 = Stream.of(array);
		stream1.forEach(System.out::println);
	}
}

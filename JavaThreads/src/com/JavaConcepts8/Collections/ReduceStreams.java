package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//This terminal operation performs a reduction on the elements of the
// stream with the given function
public class ReduceStreams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Scala", "C", "C++", "LIsp");
		Optional<String> reduced = names.stream().sorted().reduce((s1, s2) -> s1 + "" + s2);
		reduced.ifPresent(System.out::println);
	}
}

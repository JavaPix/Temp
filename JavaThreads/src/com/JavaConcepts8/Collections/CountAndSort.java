package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountAndSort {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("Java","Scala","C","C++","Haskell");
		Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result);
	}
}

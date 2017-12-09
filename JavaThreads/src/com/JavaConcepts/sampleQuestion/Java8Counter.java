package com.JavaConcepts.sampleQuestion;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Counter {

	public static void main(String[] args) {
		String[] arr = {"program","Java","program","Java","program","web"};
		Stream<String> stream = Stream.of(arr).parallel();
		Map<String, Long> counter = stream.collect(Collectors.groupingBy(String::toString,Collectors.counting()));
		System.out.println(counter.get("Java"));
	}
}

package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);
	}
}

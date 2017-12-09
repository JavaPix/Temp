package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class lstElements {

	public static void main(String[] args) {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
	}
}

package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;

public class IteratingOverLst {

	public static void main(String[] args) {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(n -> System.out.print(n));
		features.forEach(System.out::println);
	}
}

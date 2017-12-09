package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listIterating {

	public static void main(String[] args) {
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);
	}
}

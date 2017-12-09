package com.JavaConcepts8.Collections;

import java.util.Optional;

//Optionals are not functional interfaces, instead it's a nifty utility to prevent NullPointerException
// Optional is a simple container for a value which may be null or non-null.
// Think of a method which may return a non-null result but sometimes return nothing
public class OptionalsConcept {

	public static void main(String[] args) {
		Optional<String> optional = Optional.of("Java");
		optional.isPresent();
		optional.get();
		optional.orElse("fallback");
		optional.ifPresent((s) -> System.out.println(s.charAt(0)));
	}
}

package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.List;

//core stream operations
//Intermediate Operations:
//It returns the stream itself so that we can tag multiple call methods.
public class FiltersInStreams {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("Scala");
		arrayList.add("C++");
		arrayList.add("C");
		arrayList.add("Haskell");
		arrayList.add("Lisp");
		arrayList.stream().filter((s)->s.startsWith("C")).forEach(System.out::println);
		arrayList.stream().filter((s)->s.startsWith("J")).map(String::toUpperCase).forEach(System.out::println);
		arrayList.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}
}

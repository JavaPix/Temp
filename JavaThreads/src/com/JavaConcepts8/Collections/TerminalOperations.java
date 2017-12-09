package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//core Terminal operations
//It returns a result of certain type instead of a stream.
public class TerminalOperations {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("Scala");
		arrayList.add("C++");
		arrayList.add("C");
		arrayList.add("Haskell");
		arrayList.add("Lisp");
		arrayList.forEach(System.out::println);
		arrayList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println(arrayList.stream().filter((s)->s.startsWith("J")).count());
		Optional<String> optionalList= arrayList.stream().reduce((s1,s2)->s1+"#"+s2);
		optionalList.ifPresent(System.out::println);
	}
}

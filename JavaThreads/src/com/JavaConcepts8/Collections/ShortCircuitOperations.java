package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.List;

public class ShortCircuitOperations {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("Scala");
		arrayList.add("C++");
		arrayList.add("C");
		arrayList.add("Haskell");
		arrayList.add("Lisp");
		System.out.println(arrayList.stream().anyMatch((s)->s.startsWith("J")));
		System.out.println(arrayList.stream().filter((s)->s.startsWith("J")).findFirst().get());
	}
}

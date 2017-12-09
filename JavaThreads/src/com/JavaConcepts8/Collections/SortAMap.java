package com.JavaConcepts8.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortAMap {

	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<Integer, String>();
		names.put(10, "Java");
		names.put(20, "Scala");
		names.put(30, "C");
		names.put(40, "C++");
		names.put(50, "Python");
		Map<Integer, String> result = names.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new));
		System.out.println(result);
	}
}

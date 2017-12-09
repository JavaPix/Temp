package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapToLst {

	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<Integer, String>();
		names.put(10, "Java");
		names.put(20, "Scala");
		names.put(30, "C");
		names.put(40, "C++");
		names.put(50, "Python");
		List<Integer> result = new ArrayList<Integer>(names.keySet());
		result.forEach(System.out::println);
		List<String> resultVal = new ArrayList<String>(names.values());
		resultVal.forEach(System.out::println);
	}
}

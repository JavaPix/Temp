package com.JavaConcepts.Collections.Set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> obj1 = new HashSet<String>();
		
		obj1.add("alive");
		obj1.add("is");
		obj1.add("awesome");
		System.out.println(obj1);
	}
}

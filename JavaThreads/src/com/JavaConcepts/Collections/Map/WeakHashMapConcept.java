package com.JavaConcepts.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapConcept {

	public static void main(String[] args) {
		Map hashMap = new HashMap();
		Map weakHashMap = new WeakHashMap();
		String keyHashMap = new String("keyHashMap");
		String keyWeakHashMap = new String("keyWeakHashMap");
		hashMap.put(keyHashMap, "Java");
		weakHashMap.put(keyWeakHashMap, "C++");
		System.gc();
		System.out.println(""+hashMap.get("keyHashMap")+": "+weakHashMap.get("keyWeakHashMap"));
	}
}

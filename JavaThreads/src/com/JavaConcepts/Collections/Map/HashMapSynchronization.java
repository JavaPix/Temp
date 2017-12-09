package com.JavaConcepts.Collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapSynchronization {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Alive");
		map.put("2", "is");
		map.put("3", "awesome");
		
		Map<String, String> syncMap = Collections.synchronizedMap(map);
		
		System.out.println("Synchronized map: "+syncMap);
		
	}
}

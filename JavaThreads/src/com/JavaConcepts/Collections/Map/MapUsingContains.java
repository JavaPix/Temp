package com.JavaConcepts.Collections.Map;

import java.util.HashMap;

public class MapUsingContains {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "first record inserted");
		hm.put("second", "second record inserted");
		hm.put("third", "third record inserted");
		
		HashMap<String, String> subMap = new HashMap<String, String>();
		subMap.put("fourth", "fourth record inserted");
		subMap.put("fifth", "fifth record inserted");
		hm.putAll(subMap);
		
		System.out.println("after adding "+hm);
		
		System.out.println(hm.containsValue("third record inserted"));
	}
}

package com.JavaConcepts.Collections.Map;

import java.util.HashMap;
import java.util.Set;

public class MapUsingSet {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "first record inserted");
		hm.put("second", "second record inserted");
		hm.put("third", "third record inserted");
		
		//using key set
		Set<String> keys = hm.keySet();
		for(String key: keys){
			System.out.println("value of "+key+" is "+hm.get(key));
		}
	}
}

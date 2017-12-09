package com.JavaConcepts.Collections.Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyBasicHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "first record inserted");
		hm.put("second", "second record inserted");
		hm.put("third", "third record inserted");
		
		HashMap<String, String> subMap = new HashMap<String, String>();
		subMap.put("fourth", "fourth record inserted");
		subMap.put("fifth", "fifth record inserted");
		hm.putAll(subMap);

		Set<Entry<String, String>> entries = hm.entrySet();
		for(Entry<String, String> ent:entries){
			System.out.println(ent.getKey()+"==>"+ent.getValue());
		}
	}
	
	
}

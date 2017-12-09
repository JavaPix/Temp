package com.JavaConcepts.Collections.Table;

import java.util.Hashtable;
import java.util.Set;

public class HashTableKeys {

	public static void main(String[] args) {
		Hashtable<String, String> hm = new Hashtable<String, String>(); 
		hm.put("first", "1");
		hm.put("second", "2");
		hm.put("third", "3");
		hm.put("fourth", "4");
		Set<String> keys = hm.keySet();
		for(String key: keys){
			System.out.println(key);
		}
	}
}

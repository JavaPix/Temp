package com.JavaConcepts.Collections.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Enumeration names;
		String key;
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("key1", "Java");
		hashtable.put("key2", "Python");
		hashtable.put("key3", "C");
		hashtable.put("key4", "C++");
		hashtable.put("key5", "Javascript");
		names = hashtable.keys();
		while(names.hasMoreElements()) {
			key = (String)names.nextElement();
			System.out.println("key: "+key+" & value: "+hashtable.get(key));
		}
	}
	
}

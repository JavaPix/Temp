package com.JavaConcepts.Collections.Table;

import java.util.Hashtable;

public class HashtableValue {

	public static void main(String[] args) {
		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("first", "1");
		hm.put("second", "2");
		hm.put("third", "3");
		hm.put("fourth", "4");
		if(hm.containsValue("1")){
			System.out.println("contains value");
		}
	}
	
}

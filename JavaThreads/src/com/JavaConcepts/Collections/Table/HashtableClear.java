package com.JavaConcepts.Collections.Table;

import java.util.Hashtable;

public class HashtableClear {

	public static void main(String[] args) {
		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("first", "1");
		hm.put("second", "2");
		hm.put("third", "3");
		hm.put("fourth", "4");
		hm.clear();
		System.out.println(hm);
	}
}

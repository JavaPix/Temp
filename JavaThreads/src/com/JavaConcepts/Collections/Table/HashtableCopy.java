package com.JavaConcepts.Collections.Table;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableCopy {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("first", "FIRST INSERTED");
		ht.put("second", "SECOND INSERTED");
		ht.put("third", "THIRD INSERTED");
		System.out.println(ht);
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("forth", "FOURTH INSERTED");
		hm.put("fifth", "FIFTH INSERTED");
		ht.putAll(hm);
		System.out.println(ht);
	}
}



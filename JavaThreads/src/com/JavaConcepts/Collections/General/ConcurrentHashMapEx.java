package com.JavaConcepts.Collections.General;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		Map<String, String> cmap = new ConcurrentHashMap<String, String>();
		cmap.put("1", "Ramesh");
		cmap.put("2", "Suresh");
		cmap.put("3", "Mahesh");
		System.out.println(cmap);
		Iterator<String> iter = cmap.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			if(key.equals("3")) {
				cmap.put("4", "Jayesh");
			}
		}
		System.out.println(cmap);
	}
}

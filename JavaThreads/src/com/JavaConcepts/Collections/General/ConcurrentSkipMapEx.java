package com.JavaConcepts.Collections.General;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipMapEx {

	public static void main(String[] args) {
		ConcurrentNavigableMap<String, String> concurrentSkpMap = new ConcurrentSkipListMap<String, String>();
		concurrentSkpMap.put("1", "Ramesh");
		concurrentSkpMap.put("2", "Suresh");
		concurrentSkpMap.put("3", "Mahesh");
		concurrentSkpMap.put("4", "Jayesh");
		System.out.println(concurrentSkpMap.ceilingEntry("3"));
		NavigableSet<String> set = concurrentSkpMap.descendingKeySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key);
		}
		System.out.println(concurrentSkpMap.firstKey());
		System.out.println(concurrentSkpMap.firstEntry());
	}
}

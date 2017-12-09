package com.JavaConcepts.Collections.Map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcepts {

	public static <K, V extends Comparable<V>> Map<K,V> sortByValues(final Map<K,V> map){
		Comparator<K> valueComparator = new Comparator<K>() {
			@Override
			public int compare(K o1, K o2) {
				int compare = map.get(o1).compareTo(map.get(o2));
				if(compare==0) {
					return 1;
				}else {
					return compare;
				}
			}
		};
		Map<K,V> sortedByValues = new TreeMap<K,V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	public static void main(String[] args) {
		TreeMap<String, String> treemap = new TreeMap<String, String>();
		treemap.put("key1", "Java");
		treemap.put("key2", "Python");
		treemap.put("key3", "C");
		treemap.put("key4", "C++");
		treemap.put("key5", "Javascript");
		
		Map<String, String> sortedMap = sortByValues(treemap);
		
		Set<Entry<String, String>> set = sortedMap.entrySet();
		
		Iterator<Entry<String, String>> i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry<String, String> map = (Map.Entry<String, String>)i.next();
			System.out.println(map.getKey()+":");
			System.out.println(map.getValue());
		}
	}
}

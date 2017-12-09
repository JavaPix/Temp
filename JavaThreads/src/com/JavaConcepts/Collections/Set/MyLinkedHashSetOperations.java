package com.JavaConcepts.Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLinkedHashSetOperations {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		lhs.add("fourth");
		lhs.add("fifth");
		
		System.out.println("linked hash set size "+lhs.size());
		System.out.println("linked has set contains "+lhs.contains("fifth"));
		System.out.println("linked hash set is empty "+lhs.isEmpty());
		
		lhs.clear();
		System.out.println("after clearing  "+lhs);
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
			
	}
}

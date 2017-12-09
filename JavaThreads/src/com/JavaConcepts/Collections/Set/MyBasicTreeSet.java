package com.JavaConcepts.Collections.Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class MyBasicTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("one");
		ts.add("two");
		ts.add("three");
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		String[] strarr = {"first","second","third", "fourth"};
		List<String> tmpList = Arrays.asList(strarr);
		TreeSet<String> unique = new TreeSet<String>(tmpList);
		System.out.println(unique);
	}
}

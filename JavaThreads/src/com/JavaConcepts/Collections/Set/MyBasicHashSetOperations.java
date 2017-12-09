package com.JavaConcepts.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class MyBasicHashSetOperations {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		
		System.out.println("is empty "+hs.isEmpty());
		System.out.println("size  is "+hs.size());
		System.out.println("contains first elements "+hs.contains("fourth"));
		
		System.out.println("iterating using iterator interface");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("fifth");
		hs2.add("sixth");
		hs2.addAll(hs);
		System.out.println("hashset contains after adding another collections ");
		System.out.println(hs2);
		
		//hs2.clear();
		System.out.println("After clearing the hash set "+hs2);
		
		String[] strArr = new String[hs2.size()];
		hs.toArray(strArr);
		
		for(String str: strArr){
			System.out.println(str);
		}
		
		
	}
}

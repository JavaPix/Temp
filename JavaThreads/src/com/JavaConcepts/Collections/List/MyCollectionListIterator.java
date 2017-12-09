package com.JavaConcepts.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollectionListIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("nagarjun");
		list.add("harsha");
		list.add("harshitha");
		list.add("bangalore");
	Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

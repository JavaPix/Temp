package com.JavaConcepts.Collections.List;

import java.util.Iterator;
import java.util.LinkedList;

public class ListUsingIterator {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("organe");
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("grapes");
		
		System.out.println("list iterator contains");
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

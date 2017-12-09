package com.JavaConcepts.Collections.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasicOperations {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("organe");
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("grapes");
		System.out.println(linkedList);
		System.out.println("size of linked list "+linkedList.size());
		System.out.println("is linked list empty ? "+linkedList.isEmpty());
		System.out.println("does it contains grapes "+linkedList.contains("grapes"));
		
		List<String> list1 = linkedList.subList(0, 1);
		System.out.println("finding list "+list1);
		
		System.out.println("first element "+linkedList.element());
		System.out.println("first element "+linkedList.getFirst());
		System.out.println("first element "+linkedList.peek());
		System.out.println("first element "+linkedList.peekFirst());
		
		Iterator<String> itr1 = linkedList.descendingIterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		
	}
}

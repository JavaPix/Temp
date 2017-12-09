package com.JavaConcepts.Collections.List;

import java.util.LinkedList;

public class ListUsingClone {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("organe");
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("grapes");
		
		LinkedList<String> list  = (LinkedList)linkedList.clone();
		System.out.println("after cloning "+list);
		
		System.out.println("Delete all the elements in the linked list");
		list.clear();
		System.out.println("after clearing "+list);
		
	}
}

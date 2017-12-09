package com.JavaConcepts.Collections.List;

import java.util.LinkedList;

public class ListUsingCntains {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("organe");
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("grapes");
		LinkedList<String> list2 = new  LinkedList<String>();
		list2.add("grapes");
		//list2.add("random");
		System.out.println("Does linked list contains all the elements: "+linkedList.containsAll(list2));
		
	}
}


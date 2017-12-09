package com.JavaConcepts.Collections.List;

import java.util.Collections;
import java.util.LinkedList;

public class ListSwap {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("organe");
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("grapes");
		
		System.out.println("swap  the values");
		Collections.swap(linkedList, 1, 2);
		System.out.println("after swapping "+linkedList );
	}
}

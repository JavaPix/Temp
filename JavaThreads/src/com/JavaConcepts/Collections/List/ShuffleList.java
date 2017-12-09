package com.JavaConcepts.Collections.List;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("organe");
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("grapes");
		
		System.out.println("linked list shuffle ");
		Collections.shuffle(linkedList);
		for(String lst: linkedList){
			System.out.println(lst);
		}
	}
}

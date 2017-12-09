package com.JavaConcepts.Collections.List;

import java.util.ArrayList;

public class AddingObjectsToSpecifiedIndex {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add(1, "one");
		lst.add(5, "five");
		for(int i=0;i<lst.size()-1;i++){
			System.out.println(lst.get(i));
		}
		System.out.println("the list of the arraylist"+lst.size());
	}
}

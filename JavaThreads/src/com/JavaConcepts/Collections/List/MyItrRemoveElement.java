package com.JavaConcepts.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyItrRemoveElement {

	public static void main(String[] args) {
		String removeElement ="Mumbai";
		List<String> list = new ArrayList<String>();
		list.add("nagarjun");
		list.add("harsha");
		list.add("harshitha");
		list.add("bangalore");
		list.add("Mumbai");
		System.out.println("Before remove: ");
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			if (removeElement.equals(itr.next())) {
				itr.remove();
			}
		}
		System.out.println("after remove");
		System.out.println(list);
	}
}

package com.JavaConcepts.Collections.List;
//reading the values from forward direction and backward direction
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("nagarjun");
		list.add("harsha");
		list.add("harshitha");
		list.add("bangalore");
		list.add("mumbai");
		ListIterator<String> itr = list.listIterator();
		System.out.println("Elements reading in forward direction");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Elements reading in backward direction");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
}

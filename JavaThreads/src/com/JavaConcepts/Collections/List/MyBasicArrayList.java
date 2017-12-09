package com.JavaConcepts.Collections.List;

import java.util.ArrayList;

public class MyBasicArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("j2ee");
		list.add("python");
		list.add("php");
		list.add("c");
		System.out.println("Element at index 1: "+list.get(1));
		System.out.println("does list contains java "+list.contains("java"));
		list.add(2,"c++");
		System.out.println(list);
		System.out.println("is it empty "+list.isEmpty());
		System.out.println("index of perl is "+list.indexOf("c"));
		System.out.println("size of arraylist "+list.size());
	}
}

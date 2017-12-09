package com.JavaConcepts.Collections.Vector;

import java.util.List;
import java.util.Vector;

public class BasicVectorOperations {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("First");
		vector.add("Second");
		vector.add("Third");
		System.out.println(vector);
		vector.add(2, "new second");
		
		System.out.println(vector.get(3));
		
		System.out.println("printing 1st element "+vector.firstElement());
		
		System.out.println("printing last element "+vector.lastElement());
		
		List<String> list = vector.subList(1, 3);
		System.out.println("values present in list "+list);
		
		System.out.println("is vector empty"+vector.isEmpty());
		
		String[] arrray = new String[vector.size()];
		vector.copyInto(arrray);
		System.out.println("inside the array");
		for(String str: arrray){
			System.out.println(str);
		}
		
	}
}

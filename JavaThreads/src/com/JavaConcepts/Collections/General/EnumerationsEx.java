package com.JavaConcepts.Collections.General;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationsEx {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Ramesh");
		lst.add("Suresh");
		lst.add("Mahesh");
		lst.add("Jayesh");
		Enumeration<String> enm = Collections.enumeration(lst);
		System.out.println("Enumerations");
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}
}

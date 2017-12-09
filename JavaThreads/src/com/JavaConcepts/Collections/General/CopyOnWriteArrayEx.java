package com.JavaConcepts.Collections.General;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayEx {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cpyLst = new CopyOnWriteArrayList<String>();
		cpyLst.add("Ramesh");
		cpyLst.add("Suresh");
		cpyLst.add("Mahesh");
		Iterator<String> iter = cpyLst.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(cpyLst);
	}
}


package com.JavaConcepts.Collections.General;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedList {

	public static void main(String[] args) {
		List<String> sync = Collections.synchronizedList(new ArrayList<String>());
		sync.add("Java");
		sync.add("Python");
		sync.add("Javascript");
		synchronized (sync) {
			Iterator<String> iter = sync.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
	}
}

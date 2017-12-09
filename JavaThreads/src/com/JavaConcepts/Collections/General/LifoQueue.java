package com.JavaConcepts.Collections.General;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;

public class LifoQueue {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>(5);
		dq.add("Java");
		dq.add("Python");
		dq.add("C");
		dq.add("C++");
		Queue<String> queue = Collections.asLifoQueue(dq);
	}
}


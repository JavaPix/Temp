package com.JavaConcepts.Collections.General;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeEx {

	public static void main(String[] args) {
		BlockingDeque<String> deque = new LinkedBlockingDeque<String>();
		deque.addFirst("Ramesh");
		deque.addLast("Suresh");
		deque.add("Mahesh");
		System.out.println(deque);
	}
}

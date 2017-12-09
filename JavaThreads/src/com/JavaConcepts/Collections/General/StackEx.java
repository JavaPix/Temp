package com.JavaConcepts.Collections.General;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<5; i++) {
			stack.push(i);
		}
		for(int i=0; i<5; i++) {
			Integer val = stack.pop();
			System.out.println(val);
		}
	}
	
	
}

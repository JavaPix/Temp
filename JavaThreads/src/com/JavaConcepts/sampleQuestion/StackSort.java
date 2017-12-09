package com.JavaConcepts.sampleQuestion;

import java.util.Stack;

public class StackSort {

	public static Stack<Integer> sortStack(Stack<Integer> input){
		Stack<Integer> tmpStack = new Stack<Integer>();
		while(!input.isEmpty()){
			int tmp = input.pop();
			System.out.println("Element taken out: "+tmp);
			while(!tmpStack.isEmpty()&&tmpStack.peek()>tmp){
				input.push(tmpStack.pop());
			}
			tmpStack.push(tmp);
			System.out.println("input: "+input);
			System.out.println("tmpStack: "+tmpStack);
		}
		return tmpStack;
	}
	
	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		input.add(11);
		input.add(2);
		input.add(1);
		input.add(55);
		input.add(44);
	}

}

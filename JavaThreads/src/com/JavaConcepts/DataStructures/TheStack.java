package com.JavaConcepts.DataStructures;

import java.util.Arrays;

public class TheStack {

	private String[] stackArray;
	private int stackSize;
	
	private int topOfStack=-1;
	
	TheStack(int size){
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input){
		if(topOfStack+1<stackSize){
			topOfStack++;
			stackArray[topOfStack] = input;
		}else{
			System.out.println("sorry but the stack is full");
		}
		displayTheStack();
		System.out.println("PUSH "+input+" was added to the stack\n");
	}
	
	public String pop(){
		if(topOfStack>=0){
			displayTheStack();
			System.out.println("POP "+stackArray[topOfStack]+" was removed from the stack\n");
			stackArray[topOfStack]="-1";
			return stackArray[topOfStack--];
		}else{
			displayTheStack();
			System.out.println("sorry but the stack is empty");
			return "-1";
		}
	}
	
	public String peek(){
		displayTheStack();
		System.out.println("PEEK "+stackArray[topOfStack]+" is at the top of the stack");
		return stackArray[topOfStack];
	}
	
	public void pushMany(String multipleValues){
		String[] tempString = multipleValues.split(" ");
		for(int i=0;i<tempString.length;i++){
			push(tempString[i]);
		}
	}
	
	public void popAll(){
		for(int i=topOfStack; i>=0; i--){
			pop();
		}
	}
	
	public void popDisplayAll(){
		String theReverse = "";
		for(int i=topOfStack;i>=0;i--){
			theReverse += stackArray[i]; 
		}
		System.out.println("The reverse "+theReverse);
		popAll();
	}
	
	public void displayTheStack(){
		for(int n = 0; n < 61; n++)System.out.print("-");
		System.out.println();
		for(int n = 0; n < stackSize; n++){
			System.out.format("| %2s "+ " ", n);
		}
		System.out.println("|");
		for(int n = 0; n < 61; n++)System.out.print("-");
			System.out.println();
		for(int n = 0; n < stackSize; n++){
			if(stackArray[n].equals("-1")) 
				System.out.print("|     ");
			else 
				System.out.print(String.format("| %2s "+ " ", stackArray[n]));
		}
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)
			System.out.print("-");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		TheStack theStack = new TheStack(10);
		theStack.push("10");
		theStack.push("17");
		theStack.push("13");
		theStack.peek();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pushMany("R E D R U M");
		theStack.popDisplayAll();
		theStack.displayTheStack();
	}
}

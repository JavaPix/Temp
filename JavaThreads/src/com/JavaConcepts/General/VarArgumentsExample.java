package com.JavaConcepts.General;

public class VarArgumentsExample {

	static void methodOne(int ...a) {
		System.out.println("Arguments length: "+a.length);
		for(int i:a) {
			System.out.println(i+" ");
		}
	}
	
	public static void main(String[] args) {
		methodOne();
		System.out.println();
		methodOne(1);
		System.out.println();
		methodOne(1,2,3,4);
	}
}

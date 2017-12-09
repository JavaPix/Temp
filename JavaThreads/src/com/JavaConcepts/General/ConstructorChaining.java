package com.JavaConcepts.General;

public class ConstructorChaining {

	public ConstructorChaining() {
		this(10);
	}
	
	public ConstructorChaining(int a) {
		this(a,20);
	}
	
	public ConstructorChaining(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		new ConstructorChaining();
		new ConstructorChaining(20);
	}
}

package com.JavaConcepts.sampleQuestion;

public class ImmutableClass {

	private final int a;
	private final int b;
	
	public ImmutableClass(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	public static void main(String[] args) {
		ImmutableClass obj = new ImmutableClass(10, 20);
		System.out.println("a="+obj.getA());
		System.out.println("b="+obj.getB());
	}
}

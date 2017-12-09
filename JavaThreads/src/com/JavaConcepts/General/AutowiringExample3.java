package com.JavaConcepts.General;

public class AutowiringExample3 {

	static class A {
		int i = 10;
	}
	static class B extends A {
		int i = 20;
	}

	static class C extends B {
		int i = 30;
	}

	static class D extends C {
		int i = 40;
	}
	
	public static void main(String[] args) {
		A a = new A();
		B b = (B)a;
		C c = (C)b;
		D d = (D)c;
		
	}
}

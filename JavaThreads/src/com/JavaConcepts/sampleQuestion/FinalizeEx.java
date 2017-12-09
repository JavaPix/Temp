package com.JavaConcepts.sampleQuestion;

public class FinalizeEx {

	public static void main(String[] args) {
		A a1= new A();
		A a2= new A();
		a1=a2;
		Runtime.getRuntime().runFinalization();
		System.out.println("Done");
	}
	static class A{
		int i=50;
		
		@Override
		protected void finalize() throws Throwable{
			System.out.println("From finalize method");
		}
	}
}

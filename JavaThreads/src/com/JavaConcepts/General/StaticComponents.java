package com.JavaConcepts.General;

public class StaticComponents {

	static class StaticClass{
		static int staticVariable;
		
		static {
			System.out.println("Static components inside the static block of staticClass");
			staticVariable=10;
		}
		static void staticmethod(){
			System.out.println("Inside the static Method");
			System.out.println(staticVariable);
		}
	}
	
	static {
		System.out.println("Static component inside the StaticComponent class");
	}
	
	public static void main(String[] args) {
		StaticClass.staticVariable=20;
		StaticClass.staticmethod();
	}
}

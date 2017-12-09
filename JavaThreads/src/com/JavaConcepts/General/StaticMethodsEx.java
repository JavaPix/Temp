package com.JavaConcepts.General;

public class StaticMethodsEx {

	interface StaticInterface{
		public void football() ;
		static void show() {
			System.out.println("Static method inside Interface");
			System.out.println("Football ground selected");
		}
	}
	
	static class Demo implements StaticInterface{

		@Override
		public void football() {
			System.out.println("Playing football");
		}
		
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.football();
		//To execute the static method
		StaticInterface.show();
	}
}

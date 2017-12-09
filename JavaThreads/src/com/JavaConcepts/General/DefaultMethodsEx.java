package com.JavaConcepts.General;

public class DefaultMethodsEx {
	interface DefMthds{
		public void cricket(int a);
		
		default void show() {
			System.out.println("Default Method In Interface");
			System.out.println("Pitch is ready");
		}
	}
	static class Demo implements DefMthds{
		@Override
		public void cricket(int a) {
			System.out.println("Playing Cricket");
		}
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.cricket(1);
		d.show();
	}
}

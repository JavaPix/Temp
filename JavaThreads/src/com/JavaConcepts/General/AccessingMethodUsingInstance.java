package com.JavaConcepts.General;

public class AccessingMethodUsingInstance {

	static class Sample {
		public void message() {
			System.out.println("Java");
		}
	}

	public static void main(String[] args) {
		try {
			Class c = Sample.class;
			Sample s = (Sample) c.newInstance();
			s.message();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

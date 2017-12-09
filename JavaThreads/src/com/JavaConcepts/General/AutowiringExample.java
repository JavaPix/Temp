package com.JavaConcepts.General;

public class AutowiringExample {

	public static void main(String[] args) {
		byte b  = 10; 
		short s = b;	//byte autowired to short
		double d = methodOne(s);
		System.out.println(d);
	}
	static float methodOne(int i) {
		long j=i;	//int is autowired to long
		return j;	//long is autowired to float
	}
}

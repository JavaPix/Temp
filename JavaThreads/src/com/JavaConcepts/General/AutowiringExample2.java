package com.JavaConcepts.General;

public class AutowiringExample2 {

	public static void main(String[] args) {
		double d = 10.0;
		float f = (float)d;
		byte b = (byte)methodOne((long)f);
		System.out.println(b);
	}
	
	static short methodOne(long l){
		int i = (int)l;
		return (short)i;
	}
}

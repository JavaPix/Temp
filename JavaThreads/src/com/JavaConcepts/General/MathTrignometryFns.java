package com.JavaConcepts.General;

public class MathTrignometryFns {

	public static void main(String[] args) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);
		System.out.println("Sin : "+Math.sin(radians));
		System.out.println("Cos: "+Math.cos(radians));
		System.out.println("Tan: "+Math.tan(radians));
		System.out.println("Cosec: "+Math.asin(radians));
		System.out.println("Sec: "+Math.acos(radians));
		System.out.println("Cot: "+Math.atan(radians));
	}
}

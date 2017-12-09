package com.JavaConcepts.sampleQuestion;

import java.util.Arrays;

public class QualityOfStrArr {

	public static void main(String[] args) {
		String[] s1 = {"java","jsp","struts","hibernate"};
		String[] s2 = {"java","jsp","struts","java"};
		
		System.out.println(Arrays.equals(s1,s2));
		System.out.println(Arrays.deepEquals(s1, s2));
	}
}

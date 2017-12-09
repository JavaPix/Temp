package com.JavaConcepts.sampleQuestion;

import java.util.HashSet;
import java.util.Set;

public class ItersectionOfArrays {

	// To find the intersection of two arrays
	public static void main(String[] args) {
		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };
		Set<String> setStr = new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					setStr.add(s1[i]);
				}
			}
		}
		System.out.println(setStr);
	}
}

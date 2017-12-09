package com.JavaConcepts.sampleQuestion;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LongestSubstring {

	// Find the longest substring without repeating the characters
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String strVal = sc.nextLine();
		char[] charArray = strVal.toCharArray();
		String longestSubstring = null;
		int longestSubstringlength = 0;
		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);
			} else {
				i = charPosMap.get(ch);
				charPosMap.clear();
			}
			if (charPosMap.size() > longestSubstringlength) {
				longestSubstringlength = charPosMap.size();
				longestSubstring = charPosMap.keySet().toString();
			}
		}
		System.out.println("Input string: " + strVal);
		System.out.println("The longest String: " + longestSubstring);
		System.out.println("The longest substring length: " + longestSubstringlength);
	}
}

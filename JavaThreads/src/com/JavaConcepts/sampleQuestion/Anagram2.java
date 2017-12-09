package com.JavaConcepts.sampleQuestion;

import java.util.Arrays;

public class Anagram2 {

	public static boolean isAnagram2(String word, String anagram){
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		
		return Arrays.equals(charFromWord, charFromAnagram);
	}
}

package com.JavaConcepts.sampleQuestion;

public class Anagram1 {

	public static boolean isAnagram1(String word, String anagram){
		if(word.length()!=anagram.length()){
			return false;
		}
		char[] chars = word.toCharArray();
		for(char c: chars){
			int index = anagram.indexOf(c);
			if(index != -1){
				anagram = anagram.substring(0,index)+anagram.substring(index+1, anagram.length());
			}else{
				return false;
			}
		}
		return anagram.isEmpty();
	}
}

package com.JavaConcepts.sampleQuestion;

public class Anagram3 {

	public static boolean isAnagram3(String first, String second){
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		
		for(char ch: characters){
			int index = sbSecond.indexOf(""+ch);
			if(index!=-1){
				sbSecond.deleteCharAt(index);
			}else{
				return false;
			}
		}
		return sbSecond.length()==0?true:false;
	}
}

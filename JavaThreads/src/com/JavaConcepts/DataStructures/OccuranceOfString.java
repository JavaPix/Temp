package com.JavaConcepts.DataStructures;

import java.util.HashMap;

public class OccuranceOfString {

	public static void main(String[] args) {
		characterCount("my name is nagarjun");
		characterCount("IGATE was sold to capgemini");
	}
	
	public static void characterCount(String stringValues){
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		char[] chararr = stringValues.toCharArray();
		
		for(char c: chararr){
			if(countMap.containsKey(c)){
				countMap.put(c, countMap.get(c)+1);
			}else{
				countMap.put(c, 1);
			}
		}
		System.out.println(countMap);
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatedCharacter1 {

	public static char getFirstNonRepeatedChar(String str){
		Map<Character,Integer> counts = new LinkedHashMap<Character, Integer>(str.length());
		for(char c: str.toCharArray()){
			counts.put(c, counts.containsKey(c)?counts.get(c)+1:1);
		}
		for(Entry<Character, Integer> entry: counts.entrySet()){
			if(entry.getValue()==1){
				return entry.getKey();
			}
		}
		throw new RuntimeException("didnt find any non repeated characters");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String strVal = sc.nextLine();
		System.out.println(getFirstNonRepeatedChar(strVal));
	}
	
	
}

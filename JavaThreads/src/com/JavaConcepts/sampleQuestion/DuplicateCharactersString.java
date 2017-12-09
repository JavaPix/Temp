package com.JavaConcepts.sampleQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersString {

	public static void main(String[] args) {
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		System.out.println("Enter the String to find the duplicate characters in string: ");
		Scanner sc = new Scanner(System.in);
		String stringValue = sc.nextLine().toLowerCase();
		char[] chrs = stringValue.toCharArray(); 
		for(Character chs: chrs){
			if(dupMap.containsKey(chs)){
				dupMap.put(chs, dupMap.get(chs)+1);
			}else{
				dupMap.put(chs, 1);
			}
		}
		Set<Character> keys = dupMap.keySet();
		for(Character ch : keys){
			if(dupMap.get(ch)>1){
				System.out.println(ch+"-->"+dupMap.get(ch));
			}
		}
	}
}

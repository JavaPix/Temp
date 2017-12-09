package com.JavaConcepts.sampleQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatedCharacter {

	public static char firstNonRepeatedChar(String str){
		Set<Character> repeating = new HashSet<Character>();
		List<Character> nonRepeating = new ArrayList<Character>();
		for(int i=0; i<str.length();i++){
			char letter = str.charAt(i);
			if(repeating.contains(letter)){
				continue;
			}
			if(nonRepeating.contains(letter)){
				nonRepeating.remove((Character)letter);
				repeating.add(letter);
			}else{
				nonRepeating.add(letter);
			}
		}
		return nonRepeating.get(0);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String strVal = sc.nextLine();
		System.out.println(firstNonRepeatedChar(strVal));
	}
}

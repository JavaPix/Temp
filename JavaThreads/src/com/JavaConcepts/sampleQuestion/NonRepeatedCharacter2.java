package com.JavaConcepts.sampleQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatedCharacter2 {

	public static char firstNonRepeatedCharacter(String word){
		HashMap<Character, Integer> scoreboard = new HashMap<Character, Integer>();
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			if(scoreboard.containsKey(c)){
				scoreboard.put(c, scoreboard.get(c)+1);
			}else{
				scoreboard.put(c, 1);
			}
		}
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			if(scoreboard.get(c)==1){
				return c;
			}
		}
		throw new RuntimeException("Undefined behaviour");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String strVal = sc.nextLine();
		System.out.println(firstNonRepeatedCharacter(strVal));
	}
}

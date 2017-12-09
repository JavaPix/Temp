package com.JavaConcepts.sampleQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class OccuranceOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strVal = sc.nextLine();
		HashMap<Character, Integer> strCount = new HashMap<Character, Integer>();
		char[] strArr = strVal.toCharArray();
		for(char c: strArr){
			char ch = Character.toLowerCase(c); 
			if(strCount.containsKey(ch)){
				strCount.put(ch, strCount.get(ch)+1);
			}else{
				strCount.put(ch,1);
			}
		}
		System.out.println(strCount);
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class RemoveSpecificCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner in = new Scanner(System.in);
		String orginalstring = in.nextLine();
		System.out.println("Enter the character to be removed: ");
		String removecharacterstring = in.next();
		String output = removeSpecificChars(orginalstring, removecharacterstring);
		System.out.println(output);
	
	}
	public static String removeSpecificChars(String originalstring, String removecharaString){
		char[] orgChararr = originalstring.toCharArray();
		char[] removechararr = removecharaString.toCharArray();
		int start, end=0;
		boolean[] tempBoolean = new boolean[128];
		
		for(start=0; start<removechararr.length;++start){
			tempBoolean[removechararr[start]]=true;
		}
		
		for(start=0; start<orgChararr.length;++start){
			if(!tempBoolean[orgChararr[start]]){
				orgChararr[end++]=orgChararr[start];
			}
		}
		return new String(orgChararr,0,end);
	}
}

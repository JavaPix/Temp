package com.JavaConcepts.sampleQuestion;

public class CheckAllAlphabetAlgorithms {

	public static void main(String[] args) {
		System.out.println(checkAllChars("Abcdefghijklmnopqrstuvwxyz"));
		System.out.println(checkAllChars("123"));
	}
	
	public static String checkAllChars(String input){
		if(input.length()<26){
			return "FALSE";
		}
		
		for(char ch='A';ch<='Z';ch++){
			if(input.indexOf(ch)< 0 && input.indexOf((char)(ch+32))<0){
				return "FALSE";
			}
		}
		return "TRUE";
	}
}

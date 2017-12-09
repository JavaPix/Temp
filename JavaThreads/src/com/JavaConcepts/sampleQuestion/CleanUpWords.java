package com.JavaConcepts.sampleQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CleanUpWords {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String strValues = input.readLine();
		StringBuffer sb = new StringBuffer();
		
		for(String s: strValues.split("[^a-zA-Z]+")){
			sb.append(' ').append(s);
		}
		
		System.out.println(sb.toString().toLowerCase().trim());
	}
	
}

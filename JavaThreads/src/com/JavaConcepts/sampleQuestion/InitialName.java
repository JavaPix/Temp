package com.JavaConcepts.sampleQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InitialName {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String s = br.readLine(), s1="";
		s=""+s;
		int len = s.length();
		char a;
		for(int i=0;i<len;i++){
			a = s.charAt(i);
			if(a==' '){
				s1=s1+s.charAt(i+1)+".";
			}
		}
		System.out.println("Initials are: "+s1);
	}
}

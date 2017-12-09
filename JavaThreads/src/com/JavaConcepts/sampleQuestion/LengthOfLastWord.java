package com.JavaConcepts.sampleQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthOfLastWord {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		int length =  solnLengthOfLastWord(str);
		System.out.println(length);
	}
	
	public static int solnLengthOfLastWord(String s){
		if(s==null || s.length()==0){
			return 0;
		}
		
		int result =0;
		int len = s.length();
		boolean flag = false;
		for(int i=len-1; i>=0; i--){
			char c = s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z')){
				flag = true;
				result++;
			}else{
				if(flag){
					return result;
				}
			}
		}
		return result;
	}
}

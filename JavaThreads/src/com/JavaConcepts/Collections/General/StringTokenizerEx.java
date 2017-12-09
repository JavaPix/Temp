package com.JavaConcepts.Collections.General;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer tkn = new StringTokenizer("my name is Ramesh", "my name is Suresh");
		while(tkn.hasMoreTokens()) {
			System.out.println(tkn.nextToken());
		}
	}
}

package com.JavaConcepts.General;

//By default, assertions are disabled. We need to run the code as given. 
//The syntax for enabling assertion statement in Java source code is
//java –ea AssertionEx
//or
//java –enableassertions AssertionEx
public class AssertionEx {

	public static void main(String[] args) {
		int val = 10;
		assert val >= 9 : "Java";
		System.out.println(val);
	}

}

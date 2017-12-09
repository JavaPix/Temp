package com.JavaConcepts.General;

public class StringsConcepts {

	public static void main(String[] args) {
		String str = "JavaConcepts";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sbuilder = new StringBuilder(str);
		sbuilder.append("8");
		System.out.println(sbuilder);
	}
}

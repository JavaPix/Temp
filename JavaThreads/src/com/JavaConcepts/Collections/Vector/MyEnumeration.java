package com.JavaConcepts.Collections.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumeration {

	public static void main(String[] args) {
		Vector<String> lang = new Vector<String>();
		Enumeration<String> en = null;
		lang.add("java");
		lang.add("struts");
		lang.add("spring");
		lang.add("hibernate");
		
		en= lang.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}

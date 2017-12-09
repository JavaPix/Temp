package com.JavaConcepts.Collections.Vector;

import java.util.Vector;

public class MyVectorClone {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		vct.add("java");
		vct.add("j2ee");
		vct.add("spring");
		vct.add("struts");
		vct.add("hibernate");
		System.out.println("vectors before cloning "+vct);
		Vector<String> vector =(Vector<String>) vct.clone();
		System.out.println("new clone values "+vector);
	}
}

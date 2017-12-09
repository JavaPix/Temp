package com.JavaConcepts.Collections.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AddingAllVectorToList {

	public static void main(String[] args) {
		Vector<String> vctr = new Vector<String>();
		vctr.add("java");
		vctr.add("j2ee");
		vctr.add("springs");
		vctr.add("Struts");
		
		List<String> list = new ArrayList<String>();
		list.add("nagarjun");
		list.add("new company");
		list.addAll(vctr);
		System.out.println("after adding the values "+list);
	}
}

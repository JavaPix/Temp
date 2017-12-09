package com.JavaConcepts.sampleQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RmvDupElemts {

	//Removing duplicate elements from arraylist using HashSet
		public static void main(String[] args) {
			ArrayList<String> lstDup = new ArrayList<String>();
			lstDup.add("java");
			lstDup.add("servlets");
			lstDup.add("c");
			lstDup.add("jsp");
			lstDup.add("struts");
			lstDup.add("jsp");
			lstDup.add("java");
			System.out.println("ArrayList with duplicate elements: ");
			System.out.println(lstDup);
			Set<String> setLst = new HashSet<String>(lstDup);
			List<String> lstWithoutDup = new ArrayList<String>(setLst); 
			System.out.println("ArrayList without duplicate elements");
			System.out.println(lstWithoutDup);
		}
}

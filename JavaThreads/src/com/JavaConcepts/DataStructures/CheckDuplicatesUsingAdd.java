package com.JavaConcepts.DataStructures;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicatesUsingAdd {

	
	public static void main(String[] args) {
		String[] withDuplicates = new String[]{"one","two","three","one"};
		String[] withoutDuplicates = new String[]{"one","two","three"};
		System.out.println("checking array with duplicate using set and list technique : "+checkDuplicatesUsingAdd(withDuplicates));
		System.out.println("Checking array without  duplicates using set and list technique: "+checkDuplicatesUsingAdd(withoutDuplicates));
	}
	public static boolean checkDuplicatesUsingAdd(String[] input){
		Set tempSet = new HashSet();
		for(String str: input){
			if(!tempSet.add(str))
				return true;
		}
		return false;
	}
}

package com.JavaConcepts.DataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesSets {

	
	public static void main(String[] args) {
		String[] withDuplicates = new String[]{"one","two","three","one"};
		String[] withoutDuplicates = new String[]{"one","two","three"};
		System.out.println("checking array with duplicate using set technique : "+checkDuplicatesUsingSet(withDuplicates));
		System.out.println("Checking array without  duplicates using set technique: "+checkDuplicatesUsingSet(withoutDuplicates));
	}
	public static boolean checkDuplicatesUsingSet(String[] input){
		List inputList = Arrays.asList(input);
		Set inputSet = new HashSet(inputList);
		if(inputSet.size()<inputList.size()){
			return true;
		}
		return false;
	}
	
}

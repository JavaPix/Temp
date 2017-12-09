package com.JavaConcepts.sampleQuestion;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		Integer[] array = {1,1,3,4,5,6,7,8};
		int size = array.length;
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		
		for(int i=0;i<size;i++){
			if(set.add(array[i])==false){
				duplicates.add(array[i]);
			}
		}
		
		if(duplicates.size()==0){
			duplicates.add(-1);
		}
		
		System.out.println(duplicates);
	}
}

package com.JavaConcepts.DataStructures;

public class CheckDuplicatesInJavaArray {

	public static void main(String[] args) {
		String[] withDuplicates = new String[]{"one","two","three","one"};
		String[] withoutDuplicates = new String[]{"one","two","three"};
		
		System.out.println("checking array with duplicate using brute force technique : "+bruteForce(withDuplicates));
		System.out.println("checking array without  duplicates using brute force technique: "+bruteForce(withoutDuplicates));
			
	}
	
	public static boolean bruteForce(String[] input){
		for(int i=0; i<input.length;i++){
			for(int j=0;j<input.length;j++){
				if(input[i].equals(input[j]) && i!=j){
					return true;
				}
			}
		}
		return false;
	}
	
}

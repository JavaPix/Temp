package com.JavaConcepts.DataStructures;

public class MyLinearSearch {

	public static void main(String[] args) {
		int arr1[] = {23,24,25,26,27,28,29};
		int searchKey = 28;
		System.out.println("key "+searchKey+" found at index  "+linearSearch(arr1,searchKey));
	}
	
	public static int linearSearch(int[] arr1,int searchKey){
		int size = arr1.length;
		for(int i=0;i<size;i++){
			if(arr1[i]==searchKey){
				return i;
			}
		}
		return -1;
	}
	
}


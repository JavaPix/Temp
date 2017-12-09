package com.JavaConcepts.DataStructures;

public class MyRecursiveSearch {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int index = recursiveBinarySearch(arr1,0,arr1.length,5);
		System.out.println("found 5 "+index);
		
		index = recursiveBinarySearch(arr1,0,arr1.length,9);
		System.out.println("found 9 "+index);
		
	}
	
	public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key){
		if(start<end){
			int mid = start + (end-start)/2;
			if(key<sortedArray[mid]){
				return recursiveBinarySearch(sortedArray, start, mid, key);
			}else if(key>sortedArray[mid]){
				return recursiveBinarySearch(sortedArray, mid+1, end, key);
			}else{
				return mid;
			}
		}
		return -(start+1);
	}
}

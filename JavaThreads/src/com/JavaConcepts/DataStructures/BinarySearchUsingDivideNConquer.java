package com.JavaConcepts.DataStructures;

public class BinarySearchUsingDivideNConquer {

	public static void main(String[] args) {
		BinarySearchUsingDivideNConquer binary = new BinarySearchUsingDivideNConquer();
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("key 9 present in "+binarySearch(arr1, 9));
		
		int[] arr2 = {11,12,13,14,15,16,17,18,19,20};
		System.out.println("13th key present in "+binarySearch(arr2,13));
	}
	
	public static int binarySearch(int[] arr, int searchkey){
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(searchkey==arr[mid]){
				return mid;
			}
			if(searchkey<arr[mid]){
				end=mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
	
	
}

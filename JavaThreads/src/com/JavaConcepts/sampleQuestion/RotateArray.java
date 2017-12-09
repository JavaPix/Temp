package com.JavaConcepts.sampleQuestion;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		leftRotate(arr, 6);
		printArray(arr);
	}
	
	public static void printArray(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void leftRotate(int arr[], int d){
		int n = arr.length;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
	}
	
	public static void reverseArray(int arr[], int start, int end){
		int temp;
		while(start<end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}

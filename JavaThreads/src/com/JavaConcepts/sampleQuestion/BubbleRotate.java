package com.JavaConcepts.sampleQuestion;

public class BubbleRotate {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(arr, k);
	}
	
	public static void rotate(int[] arr, int order){
		if(arr==null||order<0){
			throw new IllegalArgumentException();
		}
		
		for(int i=0;i<order;i++){
			for(int j=arr.length-1;j>0;j--){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1]=temp;
			}
		}
		for(int i=0;i<arr.length-1;i++)
		System.out.println(arr[i]);
	}
}

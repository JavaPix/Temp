package com.JavaConcepts.sampleQuestion;

public class LargestElement {

	public static void main(String[] args) {
		int arr[] = {1,120,56,78,87};
		int largest  = arr[0];
		int smallest = arr[0];
		int small = 0;
		int index = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largest){
				largest = arr[i];
				index = i;
			}else if(largest>arr[i]){
				smallest=arr[i];
				small=i;
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		System.out.println(index);
		System.out.println(small);
	}
}

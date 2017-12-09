package com.JavaConcepts.sampleQuestion;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Range of 1st array: ");
		int n = sc.nextInt();
		System.out.println("Enter the 1st values: ");
		int[] nums1 = new int[n];
		for(int i=0; i<n; i++){
			nums1[i]=sc.nextInt();
		}
		System.out.println("Range of 2nd array: ");
		int m = sc.nextInt();
		System.out.println("Enter the 2nd values: ");
		int nums2[] = new int[m];
		for(int i=0; i<m; i++){
			nums2[i]=sc.nextInt();
		}
		int[] result = intersection(nums1,nums2);
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i: nums1){
			set1.add(i);
		}
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i: nums2){
			if(set1.contains(i)){
				set2.add(i);
			}
			
		}
		int[] result = new int[set2.size()];
		int i=0;
		for(int n:set2){
			result[i++]=n;
		}
		return result;
		
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOf2Arrays2 {

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
	
	public static int[] intersection(int[] nums1, int[] nums2){
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i:nums1){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}else{
				map.put(i, 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i: nums2){
			if(map.containsKey(i)){
				if(map.get(i)>1){
					map.put(i, map.get(i)-1);
				}else{
					map.remove(i);
				}
			}
		}
		int[] result = new int[list.size()];
		int i = 0;
		while(i<list.size()){
			result[i]=list.get(i);
			i++;
		}
		return result;
	}
}

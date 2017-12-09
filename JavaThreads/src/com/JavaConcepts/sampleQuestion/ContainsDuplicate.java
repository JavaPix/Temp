package com.JavaConcepts.sampleQuestion;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++){
			nums[i] = sc.nextInt();
		}
		boolean isTrue = containsDuplicate(nums);
		System.out.println(isTrue);
	}
	
	public static boolean containsDuplicate(int[] nums){
		if(nums==null || nums.length==0){
			return false;
		}
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i:nums){
			if(!hashSet.add(i)){
				return true;
			}
		}
		return false;
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++){
			nums[i]=sc.nextInt();
		}
		int result = findMaxConsecutiveOnes(nums);
		System.out.println(result);
	}
	
	public static int findMaxConsecutiveOnes(int[] nums){
		int maxLength = 0;
		int tempLength = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]==1){
				tempLength++;
			}else{
				tempLength=0;
			}
			if(tempLength>maxLength){
				maxLength = tempLength;
			}
		}
		return maxLength;
	}
}

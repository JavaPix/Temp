package com.JavaConcepts.sampleQuestion;

public class StringUniqueCharacters {

	public static void main(String[] args) {
		String abc = "abcabcbb";
		
		int result = lengthOfLongestSubString(abc);
		System.out.println(result);
	}
	
	public static int lengthOfLongestSubString(String s){
		if(s==null)
			return 0;
		boolean[] flag = new boolean[256];
		int result = 0;
		int start = 0;
		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++){
			char current = arr[i];
			if(flag[current]){
				result = Math.max(result, i-start);
				for(int k=start;k<i;k++){
					if(arr[k]==current){
						start = k+1;
						break;
					}
					flag[arr[k]]=false;
				}
			}else{
				flag[current] = true;
			}
		}
		
		result = Math.max(arr.length-start, result);
		return result;
	}
	
	
}

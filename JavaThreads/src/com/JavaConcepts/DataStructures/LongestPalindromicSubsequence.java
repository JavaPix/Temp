package com.JavaConcepts.DataStructures;

public class LongestPalindromicSubsequence {

	public int findPalindrome(String A){
		char[] chars = A.toCharArray();
		int [][]LP = new int[chars.length][chars.length];
		
		for(int i=0; i<chars.length; i++){
			LP[i][i]=1;
		}
		
		for(int sublen=2; sublen<chars.length; sublen++){
			for(int i=0; i<LP.length-sublen; i++){
				int j = i+sublen-1;
				
				if(chars[i]==chars[j] && sublen==2){
					LP[i][j]=2;
				}else if(chars[i]==chars[j]){
					LP[i][j]=LP[i+1][j-1]+2;
				}else{
					LP[i][j]=Math.max(LP[i+1][j], LP[i][j-1]);
				}
			}
		}
		
		printMatrix(LP);
		return LP[0][LP.length-1];
	}
	
	
	public void printMatrix(int[][] LP){
		
			for(int i=0;i<LP.length;i++){
				for(int j=0; j<LP.length;j++){
					System.out.println(" "+LP[i][j]);
				}
				System.out.println("");
			}
	}
	
	
	public static void main(String arg[]){
		String strA = "AABCDEBAZ";
		LongestPalindromicSubsequence i = new LongestPalindromicSubsequence();
		int x = i.findPalindrome(strA);
		System.out.println("Length of Longest Palindrome in '" + strA + "' is- " + x);
	}
}

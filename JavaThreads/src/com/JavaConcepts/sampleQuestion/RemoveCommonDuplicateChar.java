package com.JavaConcepts.sampleQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveCommonDuplicateChar {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1, s2, s3 ="",s4="";
		int a[],b[], x=0, y=0;
		int len1,len2;
		char ch;
		int i,j;
		System.out.println("Enter the first sentence: ");
		s1 = br.readLine().trim();
		System.out.println("Enter the second sentence: ");
		s2 = br.readLine().trim();
		len1 = s1.length();
		len2 = s2.length();
		a = new int[len1];
		b = new int[len2];
		for(i=0;i<len1;i++){
			ch = s1.charAt(i);
			for(j=0;j<len2;j++){
				if(ch==s2.charAt(j)){
					break;
				}
			}
			if(j!=len2){
				a[x++]=i;
				b[y++]=j;
			}
		}
		
		for(i=0;i<len1;i++){
			for(j=0;j<x;j++){
				if(i==a[j]){
					break;
				}
			}
			if(j==x){
				s3 = s3+s1.charAt(i);
			}
		}
		
		for(i=0;i<len2;i++){
			for(j=0;j<y;j++){
				if(i==b[j]){
					break;
				}
			}
			if(j==y){
				s4=s4+s2.charAt(i);
			}
		}
		System.out.println("Original string1: "+s1+" Modified string: "+s3);
		System.out.println("Original string1: "+s2+" Modified string: "+s4);
	
	}
}

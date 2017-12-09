package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class FrequencyOfString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter main string: ");
		String s = scan.nextLine();
		System.out.println("Enter string to searched: ");
		String f = scan.nextLine();
		
		s = s+" ";
		int l = s.length();
		char a;
		int c=0;
		String s1="";
		for(int i=0;i<s.length();i++){
			a = s.charAt(i);
			if(a!=' '){
				s1=s1+a;
			}else{
				if(s1.equalsIgnoreCase(f)==true){
					c++;
				}
				s1="";
			}
		}
		System.out.println("Frequency of the word: "+f+" is : "+c);
	}
}

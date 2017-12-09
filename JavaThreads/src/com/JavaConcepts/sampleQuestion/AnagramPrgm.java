package com.JavaConcepts.sampleQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramPrgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the second String: ");
		String s2 = sc.nextLine();
		String cpyOfs1 = s1.replaceAll("\\s", "");
		String cpyOfs2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if(cpyOfs1.length()!=cpyOfs2.length()){
			status=false;
		}else{
			char[] s1Array = cpyOfs1.toLowerCase().toCharArray();
			char[] s2Array = cpyOfs2.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status = Arrays.equals(s1Array, s2Array);
		}
		if(status){
			System.out.println(s1+" and "+s2+" are anagrams");
		}else{
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
}

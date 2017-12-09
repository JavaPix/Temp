package com.JavaConcepts.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arith {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++){
			String strNum = br.readLine();
			String[] numarr = strNum.split("+");
			
			int sum=0;
			for(int j=0; j<numarr.length; j++){
				 int a = Integer.valueOf(numarr[j]);
				 sum += a;
			}
			System.out.println(sum);
		}
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.Scanner;

public class PairOfElmtsSum {

	//Find all the pair of elements in an array whose sum is equal to a given number:
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			System.out.println("Enter the array of numbers: ");
			int n = sc.nextInt();
			System.out.println("Enter the elements: ");
			int[] arrNum = new int[n];
			for(int i=0; i<n; i++){
				arrNum[i]=sc.nextInt();
			}
			for(int i=0; i<arrNum.length; i++){
				for(int j=i+1;j<arrNum.length;j++){
					if(arrNum[i]+arrNum[j]==num){
						System.out.println(arrNum[i]+"+"+arrNum[j]+"="+num);
					}
				}
			}
		}
}

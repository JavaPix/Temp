package com.JavaConcepts.sampleQuestion;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		System.out.println("Enter the count: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println("Enter Missing Numbers: ");
		int[] numbers = new int[count];
		for(int i=0; i<count; i++) {
			numbers[i]=sc.nextInt();
		}
		printMissingNumber1(numbers, count);
	}
	
	public static void printMissingNumber1(int[] numbers, int count){
		int missingCount = count-numbers.length;
		BitSet bitSet = new BitSet(count);
		
		for(int number: numbers){
			bitSet.set(number-1);
		}
		
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n",Arrays.toString(numbers),count);
		int lastMissingIndex = 0;
		
		for(int i=0;i<missingCount;i++){
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
	
}

package com.JavaConcepts.Collections.Set;

import java.util.HashSet;

public class ToEliminateDuplicateElements {

	public static void main(String[] args) {
		HashSet<Price> hashset = new HashSet<Price>();
		hashset.add(new Price("Banana", 40));
		hashset.add(new Price("manjo", 30));
		hashset.add(new Price("orange", 20));
		hashset.add(new Price("apple", 10));
		
		for(Price p : hashset){
			System.out.println(p);
		}
		Price dupPrice = new Price("kiwi", 50);
		hashset.add(dupPrice);
		System.out.println("After insertion ");
		for(Price p : hashset){
			System.out.println(p);
		}
	}
	
	
}

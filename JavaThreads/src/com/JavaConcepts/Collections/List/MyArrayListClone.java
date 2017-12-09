package com.JavaConcepts.Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("first");
		array.add("second");
		array.add("third");
		array.add("forth");
		array.add("fifth");
		System.out.println(array);
		ArrayList<String>  arr1 = (ArrayList<String>) array.clone();
		System.out.println("after cloning "+arr1);
		System.out.println("in array ");
		System.out.println("Actual arraylist "+array.subList(1, 4));
		String[] strArr = new String[array.size()];
		array.toArray(strArr);
		for(String str : strArr){
			System.out.println("str "+str);
		}
		
		Collections.reverse(array);
		System.out.println("After reversing the list applications ");
		for(String str: array){
			System.out.println(str);
		}
		
		Collections.shuffle(array);
		System.out.println("After shuffle operations: ");
		for(String str: array){
			System.out.println(str);
		}
		
		Collections.swap(array, 1, 2);	
		System.out.println("after swapping "+ array);
		
		
	}
}

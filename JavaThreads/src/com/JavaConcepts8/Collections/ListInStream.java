package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ListInStream {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);	
		}
		Stream<Integer> strm = list.stream();
		strm.forEach(System.out::println);
	}
}

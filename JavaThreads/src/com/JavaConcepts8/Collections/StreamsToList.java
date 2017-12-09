package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsToList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);	
		}
		Stream<Integer> intLst = list.stream();
		intLst.filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);
	}
}

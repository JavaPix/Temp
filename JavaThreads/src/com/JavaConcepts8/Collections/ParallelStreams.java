package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		Stream<Integer> streamList = list.parallelStream();
		Integer[] val = streamList.filter((i)->i%2==0).toArray(Integer[]::new);
		System.out.println(val);
	}
}

package com.JavaConcepts.sampleQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class NthLongestStringAlgorithm {

	public static void main(String[] args) {
		int n=2;
		List<String> list = new ArrayList<String>();
		list.add("sachin");
		list.add("dhoni");
		list.add("Yuvi");
		list.add("ganguly");
		list.add("rahul");
		
		System.out.println(findNthLongestElement(list,n));
	}
	
	public static List<String> findNthLongestElement(List<String> list, int n){
		
		if(n<1){
			return null;
		}
		
		TreeMap<Integer, List<String>> map = new TreeMap<>();
		
		for(String str:list){
			Integer length = str.length();
			List<String> tempList = map.get(length)!=null?map.get(length):new ArrayList<String>();
			tempList.add(str);
			map.put(length,tempList);
		}
		return map.get(map.descendingKeySet().toArray()[n-1]);
	}
}

package com.JavaConcepts.Collections.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListToCsvString {

	public String getListAsCsvString(List<String> list){
		StringBuilder sb = new StringBuilder();
		for(String str: list){
			if(sb.length()!=0){
				sb.append(",");
			}
			sb.append(str);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("animal");
		list.add("birds");
		list.add("java");
		LinkedListToCsvString csv = new LinkedListToCsvString();
		System.out.println(csv.getListAsCsvString(list));
		
		
	}
}

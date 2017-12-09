package com.JavaConcepts.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class MyListToCsvString {
	public String getListAsCsvString(List<String> list){
		StringBuilder sb = new StringBuilder();
		for(String str : list){
			if(sb.length()!=0){
				sb.append(",");
			}
			sb.append(str);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("nagarjun");
		list.add("harsha");
		list.add("harshitha");
		list.add("Bangalore");
		
		MyListToCsvString mtc = new MyListToCsvString();
		System.out.println(mtc.getListAsCsvString(list));
		
		List<String> list2 = new ArrayList<String>();
		list2.add("java");
		list2.add("unix");
		list2.add("c++");
		
		System.out.println(mtc.getListAsCsvString(list2));
	}
}

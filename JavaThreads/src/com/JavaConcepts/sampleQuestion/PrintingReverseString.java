package com.JavaConcepts.sampleQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrintingReverseString {

	
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> lst= new ArrayList<String>();
		List<StringBuilder> newList = new ArrayList<StringBuilder>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int N = Integer.parseInt(line);
		if(N>=1 && N<=10){
		for(int i=0;i<N;i++){
			lst.add(br.readLine());
		}
		}
		Collections.singletonList(lst);
		
		Iterator<String> itr = lst.listIterator();
		while(itr.hasNext()){
			String variable = itr.next();
			char[] charVariable = variable.toCharArray();
			StringBuilder var = new StringBuilder();
			var.append(charVariable);
			var = var.reverse();
			newList.add(var);
		}
		
			
		Iterator<StringBuilder> finalValue = newList.listIterator();
		while(finalValue.hasNext()){
			System.out.println(finalValue.next());
		}
	}
}

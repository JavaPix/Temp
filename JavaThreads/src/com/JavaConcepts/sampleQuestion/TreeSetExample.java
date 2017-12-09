package com.JavaConcepts.sampleQuestion;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		System.out.println("Tree set example\n");
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(60);
		tree.add(34);
		
		Iterator<Integer> iterator = tree.iterator();
		System.out.println("Tree set data: ");
		
		while(iterator.hasNext()){
			System.out.println(iterator.next()+" ");
		}
		System.out.println();
		
		
		if(tree.isEmpty()){
			System.out.println("Tree set is empty: ");
		}else{
			System.out.println("Tree set size: "+tree.size());
		}
		
		System.out.println("First data: "+tree.first());
		System.out.println("Last data: " + tree.last());
		
		if(tree.remove(34)){
			System.out.println("Data is removed from the tree set");
		}else{
			System.out.println("data doesnt exit");
		}
		System.out.print("Now the tree set contain: ");
		iterator = tree.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("Now the size of tree set: " + tree.size());
		
		tree.clear();
		if (tree.isEmpty()) {
			System.out.print("Tree Set is empty.");
		} else {
			System.out.println("Tree Set size: " + tree.size());
		}
	}
}

package com.nag.designPatterns.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		RecordCollection recordCollection = new RecordCollection();
		IIterator iter = recordCollection.createIterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}

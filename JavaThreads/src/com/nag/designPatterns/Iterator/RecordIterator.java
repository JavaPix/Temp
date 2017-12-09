package com.nag.designPatterns.Iterator;

public class RecordIterator implements IIterator{

	private int index;
	private String recordArray[] = {"first","second","third","fourth","fifth"};
	
	public boolean hasNext(){
		if(index<recordArray.length)
			return true;
		else
			return false;
	}
	
	public Object next(){
		if(this.hasNext())
			return recordArray[index++];
		else
			return null;
	}
}

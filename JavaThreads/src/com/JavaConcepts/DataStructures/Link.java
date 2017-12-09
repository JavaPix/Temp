package com.JavaConcepts.DataStructures;

public class Link {

	public String bookName;
	public int millionSold;
	
	public Link next;
	
	public Link(String bookName, int millionSold){
		this.bookName=bookName;
		this.millionSold=millionSold;
	}
	
	public void display(){
		System.out.println(bookName +": "+millionSold+",000,000 sold");
	}
	
	public String toString(){
		return bookName;
	}
	
	public static void main(String[] args) {
		LinkList theLinkList = new LinkList();
		theLinkList.insertFirstLink("don quixote", 500);
		theLinkList.insertFirstLink("tale of two cities", 400);
		theLinkList.insertFirstLink("lord of the rings", 300);
		theLinkList.insertFirstLink("Harry potter", 700);
		
		theLinkList.display();
		System.out.println("Value of first in linkedlist "+theLinkList.firstLink+"\n");
		
		theLinkList.removeFirst();
		theLinkList.display();
		System.out.println(theLinkList.find("lord of the rings").bookName+" was found");
		
		theLinkList.removeFirst();
		theLinkList.display();
	}
}


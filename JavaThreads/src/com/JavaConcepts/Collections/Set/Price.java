package com.JavaConcepts.Collections.Set;

public class Price {

	private String item;
	private int price;
	
	public Price(String item, int price){
		this.item=item;
		this.price=price;
	}
	
	public int hashCode(){
		System.out.println("In hashcode");
		int hashCode = 0;
		hashCode = price*20;
		hashCode = hashCode+item.hashCode();
		return hashCode;
	}
	
	public boolean equals(Object obj){
		System.out.println("in equals");
		if(obj instanceof Price){
			Price pp = (Price) obj;
			return (pp.item.equals(this.item)&& pp.price==this.price);
		}else{
			return false;
		}
	}
	
	public String toString(){
		return ("item : "+item +" : price : "+price);
	}
}

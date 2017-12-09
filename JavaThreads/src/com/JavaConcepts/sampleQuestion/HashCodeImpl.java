package com.JavaConcepts.sampleQuestion;

import java.util.HashMap;

public class HashCodeImpl {

	public static void main(String[] args) {
		HashMap<Price, String> hm = new HashMap<Price, String>();
		hm.put(new Price("Banana", 1), "Banana");
		hm.put(new Price("Apple", 2), "Apple");
		hm.put(new Price("Mango", 3), "Mango");
		System.out.println("hashcode of the key: "+new Price("Banana", 0).hashCode());
		System.out.println("value from map: "+ hm.get(new Price("Banana",11)));
	}
	static class Price {
		private String item;
		private int price;
		
		public Price(String itm, int pr){
			this.item = itm;
			this.price = pr;
		}
		
		public int hashCode(){
			System.out.println("In hashcode");
			int hashCode = 0;
			hashCode = price*20;
			hashCode += item.hashCode();
			return hashCode;
		}
		
		public boolean equals(Object obj){
			System.out.println("In equals");
			if(obj instanceof Price){
				Price pp = (Price)obj;
				return (pp.item.equals(this.item)&&pp.price==this.price);
			}else{
				return false;
			}
		}

		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		public String toString(){
			return "item: "+item+"   price: "+price; 
		}
	}
}


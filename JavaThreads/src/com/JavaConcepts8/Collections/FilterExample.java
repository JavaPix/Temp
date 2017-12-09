package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static class Product{
		int id;
		String name;
		float price;
		public Product(int id, String name, float price){
			this.id=id;
			this.name=name;
			this.price=price;
		}
	}
	public static void main(String[] args) {
		List<Product> lstProduct = new ArrayList<Product>();
		lstProduct.add(new Product(1, "Apple", 100.00f));
		lstProduct.add(new Product(2, "Pineapple", 50.00f));
		lstProduct.add(new Product(3, "Orange", 70.00f));
		lstProduct.add(new Product(4, "muskmelon", 60.00f));
		lstProduct.add(new Product(5, "Banana", 30.00f));
		lstProduct.stream().filter(p->p.price>30.00f).map(p->p.price).forEach(System.out::println);
		lstProduct.stream().filter(p->p.price>30.00f).map(p->p.price).collect(Collectors.toList()).forEach(System.out::println);
	}
}

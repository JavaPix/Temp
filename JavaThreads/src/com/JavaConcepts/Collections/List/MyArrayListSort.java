package com.JavaConcepts.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyArrayListSort {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("nagarjun", 10));
		list.add(new Employee("harsha",20));
		list.add(new Employee("harshitha", 30));
		Collections.sort(list,new SalaryComparator());
		for(Employee e1: list){
			System.out.println(e1.toString());
		}
	}
	
}

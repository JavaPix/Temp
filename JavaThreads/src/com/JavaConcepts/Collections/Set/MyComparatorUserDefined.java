package com.JavaConcepts.Collections.Set;

import java.util.TreeSet;


public class MyComparatorUserDefined {

	public static void main(String[] args) {
		TreeSet<Employee> nameComp = new TreeSet<Employee>(new MyNameComp());
		nameComp.add(new Employee("Nagarjun",200));
		nameComp.add(new Employee("harsha",300));
		nameComp.add(new Employee("harshitha",100));
		
		for(Employee e : nameComp ){
			System.out.println(e);
		}
	}
}

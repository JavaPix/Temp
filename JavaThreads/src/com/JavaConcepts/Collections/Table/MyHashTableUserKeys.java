package com.JavaConcepts.Collections.Table;

import java.util.Hashtable;

public class MyHashTableUserKeys {

	public static void main(String[] args) {
		Hashtable<Employee, String> ht = new Hashtable<Employee, String>();
		ht.put(new Employee("nagarjun", 20000, 1), "NAGARJUN");
		ht.put(new Employee("harsha", 21000, 2), "HARSHA");
		ht.put(new Employee("harshitha", 22000, 3), "HARSHITHA");
		
		Employee e = new Employee("harsha", 21000, 2);
		System.out.println(ht.get(e));
	}
}

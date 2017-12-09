package com.JavaConcepts.Collections.Table;

import java.util.Hashtable;

public class HashtableHashCode {

	public static void main(String[] args) {
		Hashtable<Emp, String> ht = new Hashtable<Emp, String>();
		ht.put(new Emp("Nagarjun",10000), "Nag");
		ht.put(new Emp("Mallikarjun",15000), "Malli");
		ht.put(new Emp("Ramesh",9000), "Ram");
		
		Emp e = new Emp("Nagarjun",10000);
		System.out.println(ht.get(e));
	}
	static class Emp{
		private String name;
		private int salary;
		public Emp(String name, int salary) {
			this.name=name;
			this.salary=salary;
		}
		public String getName() {
			return name;
		}
		public int getSalary() {
			return salary;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Name: "+this.name+"; salary: "+this.salary;
		}
		@Override
		public int hashCode() {
			return this.getSalary();
		}
		
		@Override
		public boolean equals(Object obj) {
			Emp e = null;
			if(obj instanceof Emp) {
				e = (Emp)obj;
			}
			System.out.println("Equals");
			if(this.getSalary()==e.getSalary()) {
				return true;
			}else {
				return false;
			}
		}
	}
}


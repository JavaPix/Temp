package com.JavaConcepts8.Collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComparatorExample {

	
	static class Employees{
		private String name;
		private BigDecimal salary;
		private int number;
		public Employees(String name, BigDecimal salary, int number){
			this.name=name;
			this.salary=salary;
			this.number=number;
		}
		public String getName() {
			return name;
		}
		public int getNumber() {
			return number;
		}
		public BigDecimal getSalary() {
			return salary;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public void setSalary(BigDecimal salary) {
			this.salary = salary;
		}
	}
	
	public static void main(String[] args) {
		List<Employees> result = new ArrayList<Employees>();
		result.add(new Employees("Ramesh", new BigDecimal(20000),101));
		result.add(new Employees("Suresh", new BigDecimal(30000), 105));
		result.add(new Employees("Mahesh", new BigDecimal(50000), 107));
		result.add(new Employees("Jayesh", new BigDecimal(10000), 102));
		result.add(new Employees("Sajesh", new BigDecimal(40000), 108));
		result.sort((Employees e1, Employees e2)->e1.getName().compareTo(e2.getName()));
		result.sort((Employees e1, Employees e2)->e1.getSalary().compareTo(e2.getSalary()));
		result.sort((e1, e2)->e1.getNumber()-e2.getNumber());
		System.out.println(result);
	}
}

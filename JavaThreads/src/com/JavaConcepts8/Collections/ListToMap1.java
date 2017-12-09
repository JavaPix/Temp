package com.JavaConcepts8.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ListToMap1 {

	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<Employee>();
		lst.add(new Employee(1, "Ramesh", 10000));
		lst.add(new Employee(2, "Suresh", 30000));
		lst.add(new Employee(3, "Mahesh", 70000));
		lst.add(new Employee(4, "Jayesh", 40000));

		// Different ways of representing the maps
		Map<Integer, String> result1 = lst.stream().collect(Collectors.toMap((x) -> x.getId(), (x) -> x.getName()));
		System.out.println(result1);

		Map<String, Integer> result2 = lst.stream()
				.collect(Collectors.toMap(Employee::getName, Employee::getSalary, (oldValue, newValue) -> oldValue));
		System.out.println(result2);

		Map<String, Integer> result3 = lst.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toMap(Employee::getName, Employee::getSalary, (oldValue, newValue) -> newValue,
						LinkedHashMap<String, Integer>::new));
		System.out.println(result3);
	}

	static class Employee {
		private int id;
		private String name;
		private int salary;

		public Employee(int id, String name, int salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
	}
}

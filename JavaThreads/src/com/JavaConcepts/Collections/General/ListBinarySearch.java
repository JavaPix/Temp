package com.JavaConcepts.Collections.General;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListBinarySearch {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1,"Ramesh",10000));
		empList.add(new Emp(2,"Suresh",15000));
		empList.add(new Emp(3,"Mahesh",12000));
		empList.add(new Emp(4,"Jayesh",11000));
		
		Emp searchKey = new Emp(3,"Mahesh",12000);
		
		
	}
		
	static class EmpComp{
		public int compare(Emp e1, Emp e2) {
			if(e1.getId()==e2.getId()) {
				return 0;
			}else {
				return -1;
			}
		}
	}
	static class Emp{
		private int id;
		private String name;
		private int sal;
		public Emp(int id, String name, int sal) {
			this.id=id;
			this.name=name;
			this.sal=sal;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getSal() {
			return sal;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
	}
}

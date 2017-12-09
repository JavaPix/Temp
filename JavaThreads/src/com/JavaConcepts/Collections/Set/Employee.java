package com.JavaConcepts.Collections.Set;

public class Employee {

	private String name;
	private int id;
	
	public Employee(String name, int id){
		this.id=id;
		this.name=name;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String toString(){
		return ("name : "+name+" id: "+id);
	}
}

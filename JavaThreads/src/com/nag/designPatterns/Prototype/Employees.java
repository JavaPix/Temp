package com.nag.designPatterns.Prototype;

public class Employees implements PrototypeEx{

	private int id;
	private String name;
	private int salary;
	
	@Override
	public PrototypeEx getClone() {
		return new Employees(id, name, salary);
	}

	public Employees(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void showRecord() {
		System.out.println(id+":"+name+":"+salary);
	}
	
	
}

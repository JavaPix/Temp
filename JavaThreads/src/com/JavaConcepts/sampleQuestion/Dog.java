package com.JavaConcepts.sampleQuestion;

import java.io.Serializable;

public class Dog implements Serializable{

	private static final long serialVersionUID = -5742822984616863149L;
	
	private String name;
	private String color;
	private transient int weight;
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public void introduce(){
		System.out.println("I have a "+color+" "+name+".");
	}
}

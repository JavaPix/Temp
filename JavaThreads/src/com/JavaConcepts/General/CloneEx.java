package com.JavaConcepts.General;

public class CloneEx {

	String name ="Clone";
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) {
		CloneEx obj1 = new CloneEx();
		try {
			CloneEx clex = (CloneEx) obj1.clone();
			System.out.println(clex.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}

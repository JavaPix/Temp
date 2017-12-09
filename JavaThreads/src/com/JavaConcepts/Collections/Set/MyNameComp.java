package com.JavaConcepts.Collections.Set;

import java.util.Comparator;

public class MyNameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2){
		if(e1.getId()>e2.getId()){
			return 1;
		}else{
			return -1;
		}
	}
}

package com.JavaConcepts.Collections.List;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.getSalary()<arg1.getSalary()){
			return 1;
		}
		return -1;
	}

}

package com.JavaConcepts.sampleQuestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContractTest {


	public static void main(String[] args) {

		EmployeeKey lookupKey1 = new EmployeeKey("100","10101984");
		EmployeeKey lookupKey2 = new EmployeeKey("101","10101985");
		EmployeeKey lookupKey3 = new EmployeeKey("101","10101985");
		EmployeeKey lookupKey4 = new EmployeeKey("102","10101986");
		EmployeeKey lookupKey5 = new EmployeeKey("102","10101986");
		
		Set<EmployeeKey> set = new HashSet<>();
		set.add(lookupKey1);
		set.add(lookupKey2);
		set.add(lookupKey3);
		set.add(lookupKey4);
		set.add(lookupKey5);
		
		System.out.println(set);
	}
	
	static Map<EmployeeKey,String> loadEmpCache(){
		EmployeeKey key1 = new EmployeeKey("100","10101984");
		EmployeeKey key2 = new EmployeeKey("101","10101985");
		EmployeeKey key3 = new EmployeeKey("102","10101986");
		
		Map<EmployeeKey, String> cache = new HashMap<EmployeeKey, String>();
		cache.put(key1, "Imdad");
		cache.put(key2, "Nag");
		cache.put(key3, "igate");
		
		return cache;
	}

}

class EmployeeKey{
	String empId;
	String dob;
	
	public EmployeeKey(String empId, String dob){
		this.empId=empId;
		this.dob=dob;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeKey [empId=" + empId + ", dob=" + dob + "]\n";
	}
	
}
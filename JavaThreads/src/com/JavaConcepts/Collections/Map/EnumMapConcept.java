package com.JavaConcepts.Collections.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapConcept {

	public enum Days{
		Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday,Sunday
	}
	public static void main(String[] args) {
		EnumMap<Days, String> enumMap = new EnumMap<Days,String>(Days.class);
		enumMap.put(Days.Monday, "1");
		enumMap.put(Days.Tuesday, "2");
		enumMap.put(Days.Wednesday, "3");
		enumMap.put(Days.Thrusday, "4");
		enumMap.put(Days.Friday, "5");
		enumMap.put(Days.Saturday, "6");
		enumMap.put(Days.Sunday, "7");
		
		for(Map.Entry m: enumMap.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}

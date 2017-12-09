package com.JavaConcepts.Collections.Table;

import java.util.*;
import java.util.Map.Entry;


public class MyHashTableOperations {

	public static void main(String[] args) {
		//hash table uses first in last out 
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("first", "First inserted");
		ht.put("second", "Second inserted");
		ht.put("third", "third inserted");
		System.out.println(ht);
		System.out.println("value present in 2nd hashtable "+ht.get("second"));
		System.out.println("is hashtable empty "+ht.isEmpty());
		//ht.remove("third");
		System.out.println("hash table size "+ht.size());
		
		//using only keys
		Set<String> keys = ht.keySet();
		System.out.println(keys);
		for(String key: keys){
			System.out.println("key is "+key + " and value is  "+ht.get(key));
		}
		
		
		if(ht.containsKey("first")){
			System.out.println("the hashtable contains key first");
		}else{
			System.out.println("the hashtable does not contains key first");
		}
		
		//getting values from the key table
		Set<Entry<String, String>> entries = ht.entrySet();
		for(Entry<String, String> ent:entries){
			System.out.println("using entry set "+ent.getKey()+" , "+ent.getValue());
		}
		
		//using enumerations 
		Enumeration<String> key = ht.keys();
		while(key.hasMoreElements()){
			String keys1 =key.nextElement();
			System.out.println("using enumerations "+keys1);
		}
		
		
	}
}

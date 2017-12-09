package com.JavaConcepts8.Collections;

import java.util.Comparator;

import com.JavaConcepts8.Collections.ConstructorRef.Person;

//comparators added various concepts
public class ComparatorsConcept {

	public static void main(String[] args) {
		Comparator<Person> comparator = (p1, p2) -> p1.lastName.compareTo(p2.lastName);
		Person p1 = new Person("Java", "8");
		Person p2 = new Person("Spring", "5");
		System.out.println(comparator.compare(p1, p2));
		System.out.println(comparator.reversed().compare(p1, p2));
	}
}

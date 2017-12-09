package com.JavaConcepts8.Collections;

public class ConstructorRef {

	public static void main(String[] args) {
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Java", "8");
		System.out.println(person.firstName+":"+person.lastName);
	}

	// working on the constructor references
	static class Person {
		String firstName;
		String lastName;

		public Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}

	interface PersonFactory<P extends Person> {
		P create(String firstName, String lastName);
	}
}

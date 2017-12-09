package com.JavaConcepts8.Collections;

import java.util.function.Supplier;

import com.JavaConcepts8.Collections.ConstructorRef.Person;

//Suppliers produce a result of a given generic type.
// Unlike Functions, Suppliers don't accept arguments.
public class LambdaSuppliers {

	public static void main(String[] args) {
		Supplier<Person> personSupplier = () -> {
			return new Person("Java", "8");
		};
		Person p = personSupplier.get();
		System.out.println(p.firstName);
	}
}

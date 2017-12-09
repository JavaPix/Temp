package com.JavaConcepts8.Collections;

import java.util.function.Consumer;

import com.JavaConcepts8.Collections.ConstructorRef.Person;

//Consumers represents operations to be performed
public class CustomersLambda {

	public static void main(String[] args) {
		Consumer<Person> greeter = (p) -> System.out.println("Hello " + p.firstName);
		greeter.accept(new Person("Java", "8"));
		
	}
}

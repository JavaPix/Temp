package com.JavaConcepts.General;

public class AbstractionExample {

	abstract class Animal{
		abstract void numberOfLegs();
	}
	
	class Cat extends Animal{
		@Override
		void numberOfLegs() {
			System.out.println("Number of legs is four");
		}
	}
	
}

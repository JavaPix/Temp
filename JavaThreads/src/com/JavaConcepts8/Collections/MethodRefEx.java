package com.JavaConcepts8.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodRefEx {

	public static void main(String[] args) {
		final Car car = Car.create(Car::new); //ways of creating the object 
		final List<Car> cars = Arrays.asList(car);
		cars.forEach(Car::collide); //static method references Class::static method with one parameters
		cars.forEach(Car::repair);//method references Class::method with no parameters
		final Car car1 = Car.create(Car::new);
		cars.forEach(car1::follow);//method references instance::method with one parameters
	}
	
	public static class Car{
		public static Car create(final Supplier<Car> supplier){
			return supplier.get();
		}
		public static void collide(final Car car){
			System.out.println("Collided: "+car.toString());
		}
		public void follow(final Car follow){
			System.out.println("follow: "+follow.toString());
		}
		public void repair(){
			System.out.println("Repair: "+this.toString());
		}
	}
}

package com.JavaConcepts.General;

public class MethodOverridingEx {

	static class Vehicle{
		public void start() {
			System.out.println("Start the Vehicle");
		}
	}
	static class Bike extends Vehicle{
		public void start() {
			System.out.println("Start the bike");
		}
	}
	
	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		Vehicle v = new Vehicle();
		v.start();
	}
}

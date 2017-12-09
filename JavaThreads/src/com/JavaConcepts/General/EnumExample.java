package com.JavaConcepts.General;

public class EnumExample {

	public enum Direction{
		EAST,WEST,NORTH,SOUTH
	}
	
	public static void main(String[] args) {
		Direction direction = Direction.EAST;
		System.out.println(direction);
	}
}

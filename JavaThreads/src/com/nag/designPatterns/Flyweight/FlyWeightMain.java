package com.nag.designPatterns.Flyweight;

public class FlyWeightMain {
	static String[] color = {"Red","Blue","Green","White"};
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	private static String getRandomColor() {
		return color[(int)(Math.random()*color.length)];
	}
	
	private static int getRandomX() {
		return (int)(Math.random()*100);
	}
	
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
	
}

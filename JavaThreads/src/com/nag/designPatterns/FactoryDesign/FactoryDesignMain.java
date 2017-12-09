package com.nag.designPatterns.FactoryDesign;

public class FactoryDesignMain {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		
	}
}

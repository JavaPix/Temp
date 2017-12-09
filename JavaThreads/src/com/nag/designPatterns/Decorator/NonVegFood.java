package com.nag.designPatterns.Decorator;

public class NonVegFood extends FoodDecorator{

	public NonVegFood(Food newFood) {
		super(newFood);
	}

	public String prepareFood() {
		return super.prepareFood();
	}
	
	public double foodPrice() {
		return super.foodPrice();
	}
	
}

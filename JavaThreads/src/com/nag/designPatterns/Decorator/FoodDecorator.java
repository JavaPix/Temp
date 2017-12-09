package com.nag.designPatterns.Decorator;

public class FoodDecorator implements Food{

	private Food newFood;
	
	public FoodDecorator(Food newFood) {
		this.newFood=newFood;
	}
	
	@Override
	public String prepareFood() {
		return null;
	}

	@Override
	public double foodPrice() {
		return 0;
	}

}

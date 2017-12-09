package com.nag.designPatterns.Decorator;

public class VegFood implements Food{

	@Override
	public String prepareFood() {
		return "Indira Canteen Veg food";
	}

	@Override
	public double foodPrice() {
		return 10;
	}

}

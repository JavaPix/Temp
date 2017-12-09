package com.nag.designPatterns.Decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPattern {

	private static int choice;

	public static void main(String[] args) throws NumberFormatException, IOException {
		do {
			System.out.print("1. Vegetarian Food.   \n");
			System.out.print("2. Non-Vegetarian Food.\n");
			System.out.print("3. Exit\n");
			System.out.print("Enter your choice: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1: {
				VegFood vf = new VegFood();
				System.out.println(vf.prepareFood());
				System.out.println(vf.foodPrice());
			}
				break;
			case 2: {
				Food f1 = new NonVegFood((Food) new VegFood());
				System.out.println(f1.prepareFood());
				System.out.println(f1.foodPrice());
			}
				break;
			default: {
				System.out.println("NA");
			}
				return;
			}

		} while (choice != 3);
	}
}

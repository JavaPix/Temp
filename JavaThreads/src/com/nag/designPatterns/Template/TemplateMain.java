package com.nag.designPatterns.Template;

public class TemplateMain {

	public static void main(String[] args) {
		Game cricket = new Cricket();
		cricket.play();
		System.out.println();
		Game basketBall = new BasketBall();
		basketBall.play();
	}
}

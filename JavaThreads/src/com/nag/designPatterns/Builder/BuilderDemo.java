package com.nag.designPatterns.Builder;

public class BuilderDemo {

	public static void main(String[] args) {
		CDBuilder cdBuilder  = new CDBuilder();
		CDType sonyCdType = cdBuilder.buildSonyCD();
		sonyCdType.showItems();
		
		CDType samsungCdType = cdBuilder.buildSamsungCD();
		samsungCdType.showItems();
	}
}

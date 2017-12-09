package com.nag.designPatterns.AbstractFactory;

public class IntelFactory implements CPUFactory{

	public CPU produceCPU(){
		return new IntelCPU();
	}
}

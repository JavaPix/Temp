package com.nag.designPatterns.AbstractFactory;

public class AMDFactory implements CPUFactory{

	public CPU produceCPU(){
		return new AMDCPU();
	}
	
	
}

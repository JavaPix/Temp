package com.nag.designPatterns.AbstractFactory;

public class Computer {

	CPU cpu;
	
	public Computer(CPUFactory factory){
		cpu = factory.produceCPU();
		cpu.process();
	}
}

package com.nag.designPatterns.SingleTon;

public class DoubleCheckSingleTon {
	private DoubleCheckSingleTon(){
		
	}
	private static DoubleCheckSingleTon doubleCheckin;
	public static DoubleCheckSingleTon getInstance(){
		if(doubleCheckin==null){
			synchronized (DoubleCheckSingleTon.class) {
				doubleCheckin = new DoubleCheckSingleTon();
			}
		}
		return doubleCheckin;
	}
}

package com.nag.designPatterns.SingleTon;

public class VolatileSingleton {
	private VolatileSingleton(){
		
	}
	private volatile static  VolatileSingleton volatileSingle;

	public static VolatileSingleton getInstance(){
		if(volatileSingle==null){
			synchronized (VolatileSingleton.class) {
				if(volatileSingle==null){
					volatileSingle = new VolatileSingleton();
				}
			}
			return volatileSingle;
		}
		return volatileSingle;
	}
}

package com.JavaConcepts8.Collections;

import java.util.function.Supplier;

public class DefaultStaticMethods {

	private interface Defaultable{
		default String notRequired(){
			return "Default Implementation";
		}
	}
	private static class DefaultableImpl implements Defaultable{
		
	}
	private static class OverridableImpl implements Defaultable{
		public String notRequired(){
			return "Overriden Implementation";
		}
	}
	private interface DefaultableFactory{
		static Defaultable create(Supplier<Defaultable> supplier){
			return supplier.get();
		}
	}
	
	public static void main(String[] args) {
		Defaultable defaultable = DefaultableFactory.create(DefaultableImpl::new);
		System.out.println(defaultable.notRequired());
		
		defaultable = DefaultableFactory.create(OverridableImpl::new);
		System.out.println(defaultable.notRequired());	
	}
}

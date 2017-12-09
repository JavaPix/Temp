package com.JavaConcepts8.Collections;

public class LambdaStaticRef {

	public static void main(String[] args) {
		Something something = new Something();
		Converter<String, String> converter = something::startsWith;
		String s = converter.convert("Java");
		System.out.println(s);
	}

	// passing reference of the methods or constructors via ::
	static class Something {
		String startsWith(String s) {
			return String.valueOf(s.charAt(0));
		}
	}

	@FunctionalInterface
	interface Converter<F, T> {
		T convert(F from);
	}
}

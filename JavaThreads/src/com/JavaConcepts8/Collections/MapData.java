package com.JavaConcepts8.Collections;

import java.util.HashMap;
import java.util.Map;

//As already mentioned maps don't support streams. Instead maps now support
// various new and
// useful methods for doing common tasks
public class MapData {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < 10; i++) {
			map.putIfAbsent(i, "val" + i);
		}
		map.forEach((id, val) -> System.out.println(val));
	}
}

package com.rs.java8Fetures;

import java.util.HashMap;
import java.util.Map;

public class ForEachEx {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "sruthi");
		hmap.put(2, "sowjanya");
		hmap.put(3, "sandy");
		hmap.put(4, "sahasra");

		hmap.forEach((key, value) -> System.out.println(key + " " + value));

		hmap.forEach((key, value) -> {
			if (key == 3) {
				System.out.println(value);
			}
			if (value == "sahasra") {
				System.out.println(key);
			}
		});

	}

}

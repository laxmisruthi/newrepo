package collection;

import java.util.HashMap;

public class HashMapMain {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new HashMapSample("vishal"), 20);
		map.put(new HashMapSample("sachin"), 30);
		map.put(new HashMapSample("vaibhav"), 40);

		System.out.println();
		System.out.println("Value for key sachin: " + map.get(new HashMapSample("sachin")));
		System.out.println("Value for key vaibhav: " + map.get(new HashMapSample("vaibhav")));
	}
}

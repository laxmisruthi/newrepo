package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPract {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "sruthi");
		map.put(2, "laxmi");
		map.put(3, "ravi");
		map.put(4, null);
		map.put(5, "teja");
		map.put(4, "sruthi");
		map.put(null, null);
		map.put(6, null);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}
}

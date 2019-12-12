package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDuplicateKey {
	 public static void main(String[] args) {
		  Map map = new HashMap();
		  map.put(1, "sam");
		  map.put(1, "Ian");
		  map.put(1, "Scott");
		  map.put(null, "asdf");
		  System.out.println(map);
		 }

}

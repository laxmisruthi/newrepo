package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExa {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();

		map.put(1, "apple");
		map.put(2, "orange");
		map.put(3, "mango");
		map.put(4, "banana");

		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer Key = (Integer) it.next();
			System.out.println(Key + " : " + map.get(Key));

			// This will reflect in iterator.
			// Hence, it has not created separate copy
			map.put(7, "graps");

		}
		
		// CopyOnWritearrayList
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 2, 6, 43 });
		list.removeIf(e -> (e == 2));
		System.out.println(list);

	}
}

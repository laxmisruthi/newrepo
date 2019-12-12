package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastEx {

	public static void main(String[] args) {

		// throws exception
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(12);
		array.add(17);
		array.add(19);
		array.add(36);
		array.add(64);

		Iterator<Integer> itr = array.iterator();
		while (itr.hasNext()) {
			Integer value = itr.next();
			array.add(35);

		}

		System.out.println(itr);

		// it will not throws exception
		/*
		 * ArrayList<Integer> al = new ArrayList<>(); al.add(1); al.add(2); al.add(3);
		 * al.add(4); al.add(5);
		 * 
		 * Iterator<Integer> itr = al.iterator(); while (itr.hasNext()) { if (itr.next()
		 * == 2) { // will not throw Exception itr.remove(); } }
		 * 
		 * System.out.println(al);
		 */

	}

}

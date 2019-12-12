package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListPractice {

	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		list.add("sruthi");
		list.add("laxmi");
		list.add("sruthi");
		list.add("laxmi");
		list.add("shruthi");

		// System.out.println(list);
		// iteration using iterator method
		/*
		 * Iterator<String> itr = list.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next());
		 */

		// iterating using for-each method
		/*
		 * for(String obj:list) { System.out.println(obj); }
		 */

		// iterating using forEach method
		/*
		 * list.forEach(a -> { System.out.println(a); });
		 */

		// iterating using forEachRemaining method

		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});

	}

}

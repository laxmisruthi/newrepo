package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListRemoveDuplicates {

	public static void main(String[] args) {
		// one method ---- convert list to set
		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 5, 8, 3));

		System.out.println(numbersList);

		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList); // convert list to set

		System.out.println(hashSet);

		// by using contains method
		List<String> objduplicat = new LinkedList<String>();
		objduplicat.add("sruthi");
		objduplicat.add("ravi");
		objduplicat.add("teja");
		objduplicat.add("sruthi");
		objduplicat.add("ravi");

		System.out.println(objduplicat);
		ArrayList<String> dup = new ArrayList<String>();
		Iterator<String> itr = objduplicat.iterator();

		while (itr.hasNext()) {
			String duplict = itr.next();

			if (dup.contains(duplict)) {
				itr.remove();
			} else
				dup.add(duplict);
		}
		System.out.println(dup);

		// using stream
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 4, 2, 6, 2, 1, 3, 4, 3, 6, 6));
		System.out.println(list);
		List<Integer> withOutDuplicat = list.stream().distinct().collect(Collectors.toList());
		System.out.println(withOutDuplicat);

	}

}

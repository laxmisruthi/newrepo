package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetPracts {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("sruthi");
		set.add("abhi");
		set.add("rani");
		set.add("bhanu");
		set.add("chiru");
		set.add("shruti");

		//by using while loop
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		NavigableSet<Integer> list=new TreeSet<Integer>();
		list.add(2);
		list.add(89);
		list.add(8);
		list.add(93);

		// by using forEach
		list.forEach(System.out::println);
		
		// froEach with lambda expression
		list.forEach(l -> {
			System.out.print(l+" ");
		});
		
		//using forEach with lambda and stream
		System.out.println();
		LinkedHashSet<String> haset=new LinkedHashSet<>();
		haset.add("ramya");
		haset.add("bhanu");
		haset.add("ramya");
		haset.add("ravali");
		haset.stream().forEach((lis) -> {
			System.out.print(lis+" ");
		});
	}

}

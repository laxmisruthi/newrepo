package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class CollectnSrtMain implements Comparator<CollectnSrtStdnt> {

	@Override
	public int compare(CollectnSrtStdnt a, CollectnSrtStdnt b) {
		return a.rollno - b.rollno;
	}

	public static void main(String[] args) {
		ArrayList<CollectnSrtStdnt> ar = new ArrayList<CollectnSrtStdnt>();
		ar.add(new CollectnSrtStdnt(111, "sruthi", "hyd"));
		ar.add(new CollectnSrtStdnt(110, "bhanu", "dnsr"));
		ar.add(new CollectnSrtStdnt(542, "ravali", "dsnr"));

		System.out.println("unsorted");
		ar.forEach(System.out::println);
		
		Collections.sort(ar, new CollectnSrtMain());
		
		System.out.println("\nafter sorting ");
		ar.forEach(System.out::println);
	}

}

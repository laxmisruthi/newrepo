package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBasdOnIdMain {

	public static void main(String[] args) {
		SortBasdOnId e1=new SortBasdOnId(4,"sruthi",123445,20);
		SortBasdOnId e2=new SortBasdOnId(1,"sabitha",1234467,29);
		SortBasdOnId e3=new SortBasdOnId(2,"laxmi",98645,24);
		SortBasdOnId e4=new SortBasdOnId(3,"sahasra",212234,23);
		
		List<SortBasdOnId> list=new ArrayList<SortBasdOnId>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println(list);
		//using collection.sort
		
		
		Collections.sort(list);
		System.out.println(list);
		
		//sort by name
		Collections.sort(list, new SortByName());
		System.out.println(list);
	}

}

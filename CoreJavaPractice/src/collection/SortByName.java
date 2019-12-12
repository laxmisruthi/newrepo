package collection;

import java.util.Comparator;

public class SortByName implements Comparator<SortBasdOnId>{

	@Override
	public int compare(SortBasdOnId o1, SortBasdOnId o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

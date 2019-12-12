package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Milan", "London", "New York", "San Francisco");
		
		//String str = cities.stream().collect(Collectors.joining(",")); //using stream
		System.out.println(cities);
		String str = String.join(",", cities);
		System.out.println(str);
	}

}

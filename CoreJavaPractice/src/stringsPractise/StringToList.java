package stringsPractise;

import java.util.Arrays;
import java.util.List;

public class StringToList {

	public static void main(String[] args) {

		String str = "Arun,Bhanu,Chintu,Divya";

		List<String> list = Arrays.asList(str.split(","));
		System.out.println(list);
	}

}

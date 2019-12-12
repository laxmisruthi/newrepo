package stringsPractise;

import java.nio.ShortBuffer;

public class Comparable {
	public static void main(String[] args) {

		String str1 = new String("sruthi");
		String str2 = new String("shruti");
		String str3 = new String("sruthi");

		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareToIgnoreCase("SRUTHI"));
		System.out.println("laxmi".compareTo(str2));
        
		// add two strings using concat method
		String str5 = new String("sruthi");
		str5.concat("laxmi");
		System.out.println(str5);
		System.out.println(str5.compareTo("sruthi"));

		// using split method
		String str = "this is laxmi sruthi";
		String[] str4 = str.split(" ");
		for (int i = 0; i < str4.length; i++) {
			System.out.println(str4[i]);
		}
	}

}

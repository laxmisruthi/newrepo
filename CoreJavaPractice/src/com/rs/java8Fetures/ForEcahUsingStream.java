package com.rs.java8Fetures;

import java.util.ArrayList;
import java.util.List;

public class ForEcahUsingStream {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("sruthi");
		list.add("laxmi");
		list.add("souji");
		list.add("bhanu");
		list.add("sahasra");
		list.add("sruthi");
		
		// list.forEach(str-> System.out.println(str));
		list.stream()
		.filter(f -> f.startsWith("s"))
		.parallel()
		//.forEach(n->System.out.println(n)); 
		.forEachOrdered(n-> System.out.println( n));

	}

}

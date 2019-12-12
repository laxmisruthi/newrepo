package com.rs.java8Fetures;

import java.util.Comparator;

public class AppleLamMain {

	public static void main(String[] args) {
		
		Comparator<AppleLam> byWeight = (AppleLam a1, AppleLam a2) -> a1.getWeight().compareTo(a2.getWeight());
		System.out.println(byWeight);
	}

}

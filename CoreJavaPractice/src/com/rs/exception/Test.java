package com.rs.exception;

public class Test {

	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			System.out.println(data);
			System.out.println("this is try block");
			System.out.println("there is no exception");
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("this is catch block");
			System.out.println("this class name is test");
			System.out.println("im learning this concept");
		} finally {
			System.out.println("finally block is always executed");
			System.out.println("this is sruthi");
			System.out.println("im new to this concept");
		}
		System.out.println("rest of the code...");
	}

}

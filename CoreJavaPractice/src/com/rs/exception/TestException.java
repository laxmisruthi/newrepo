package com.rs.exception;

public class TestException {
	static void sum(int a, int b) throws AddException {
		if (a < 0  || b<0) {
			throw new AddException(a,b);
		} else {
			System.out.println(a + b);
		}
	}

	public static void main(String[] args) {
		try {
			sum(-10, -10);
		} catch (AddException me) {
			System.out.println(me);
		}

	}

}

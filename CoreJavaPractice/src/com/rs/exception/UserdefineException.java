package com.rs.exception;

public class UserdefineException {

	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException(" not eligible to vote");
		} else {
			System.out.println(" welcome to vote");
		}
	}

	public static void main(String[] args) {
		try {
			validate(10);
		} catch (Exception m) {
			System.out.println("Exception occur:" + m);
			System.out.println("rest of the code.....");
		}

	}

}

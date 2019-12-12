package com.rs.exception;

public class AddException extends Exception {
	private int ea, eb;

	AddException(int a, int b) {
		ea = a;
		eb = b;
	}

	@Override
	public String toString() {
		if (ea < 0) {
			return "AddException [ea=" + ea + " ] is less than zero";
		} else {
			return "AddException [eb=" + eb + " ] is less than zero";

		}

	}
}

package com.rs.java8Fetures;

public class LambdaExpression {

	public static void main(String[] args) {
		LambdaFunctnInterface intr = (x, y) -> System.out.println(2 * x + y);
		intr.add(10, 5);
		LambdaFunctnInterface.statement();
	}

}

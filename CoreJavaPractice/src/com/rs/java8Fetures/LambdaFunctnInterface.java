package com.rs.java8Fetures;

public interface LambdaFunctnInterface {

	// An abstract function
	void add(int x,int y);
	
	 // it will not allow another abstract function
	//void abstractFun(int x);

	// A non-abstract (or default) function
	static void statement() {
		System.out.println("Hello");
	}

}

package com.tnsif.packagetest;

public class Calculator {
	public int add(int a , int b) {
		return a + b;
	}
	
	public double divide(int a , int b) {
		if (b==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return (double) a/b;
	}

}

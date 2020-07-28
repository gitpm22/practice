package com.prm.java.practice.java8Features.demo;

public class Calculator {

	public int calculate(int a, int b, Computable comp) {
		return comp.compute(a, b);
	}
	
}

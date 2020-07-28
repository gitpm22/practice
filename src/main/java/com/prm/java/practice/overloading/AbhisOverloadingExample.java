package com.prm.java.practice.overloading;

public class AbhisOverloadingExample {

	
	public void sum(float a, float b)
	{
		
		System.out.println("Float method:" + (a+b));
		
	}
	
	public void sum(double a, double b) {
		
		System.out.println("Double method: " +  (a+b));
		
	}
	
	public static void main(String[] args) {
		
		AbhisOverloadingExample obj = new AbhisOverloadingExample();
		obj.sum(1f, 2f);
		obj.sum(3, 4);
		obj.sum(1.0, 2.0);

	}

}

package com.prm.java.practice.overloading;

public class Preeti extends Mangala {
	
	public Preeti(String name) {
		
		super(name);
		System.out.println("I am Preeti Contructor");
	
	}
	
	public void displayName() {
		
		System.out.println("I am from Preeti " );

	}
	
	public void displayName(String input) {
		
		System.out.println("I am from Preeti " + input );

	}


}

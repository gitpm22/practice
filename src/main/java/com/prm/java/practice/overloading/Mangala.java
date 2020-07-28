package com.prm.java.practice.overloading;

public class Mangala {

	private String name;
	
	
	
	public String getName() {
		System.out.println("I am called from Mangala");
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mangala(String name) {
		  
		
		this.name = name;
		
		System.out.println("I am Mangala Contructor");
	}

	public void displayName() {
		
		//System.out.println("I am from Mangala");

		System.out.println(name);
	}
	
	

}

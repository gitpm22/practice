package com.prm.java.practice.oopconcepts.inheritance;

abstract public class Bike implements Automobile{
	
	public void start() {
		
		System.out.println("This is overridden method start for Bike Class");
		
	}
	
	public void stop() {
		
		System.out.println("This is overridden method stop for Bike Class");
		
	}
	
	public void accelerate() {
		
		System.out.println("This is overridden method accelerate for Bike Class");
	}
	
}

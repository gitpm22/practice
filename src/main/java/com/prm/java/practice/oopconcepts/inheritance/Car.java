package com.prm.java.practice.oopconcepts.inheritance;

abstract public class Car implements Automobile{
	
	public void start() {
		
		System.out.println("This is Overridden method start for Car Class");
	}
	
	public void stop() {
		
		System.out.println("This is overridden method stop for Car Class");
	}
	
	public void accelerate() {
		
		System.out.println("This is overridden method accelerate for car Class");
	}
	
}

package com.prm.java.practice.overloadingconcept;

public class OverloadingWithAutoBoxing {
	
	/*
	Autoboxing is not applicable to char and boolean data types it only applicable for numeral integral values
	.e.g. byte short int long float double
	 Autoboxing definition: conversion of lower range data type to its wrapper class only can be converted 
	eg. 
	

	
	byte to Byte --> Allowed
	byte to Short --> Not allowed
	byte to Integer --> Not allowed
	byte to Long --> Not allowed
	
	short to Byte --> Not Allowed
	short to Short --> Not allowed
	short to Integer --> Not allowed
	short to Long --> Not allowed
	
	
	
	int to Integer  --> allowed
	int to Long     --> Not allowed
	int to Short  --> not allowed
	
	
	 Autoboxing : int data type to Integer wrapper class 
	
	 unboxing : Integer wrapper class object to int data type
	
	
	*/
	

	public OverloadingWithAutoBoxing() {
		super();
	}
	
	public void calculateArea(Float d) {
		
		// Automatically convert double data type to Double wrapper class
		
		System.out.println("Area: " + d);
	}
	
	public void calculateArea(Integer i) {
		
		
		
		System.out.println("Area: " + i);
		
	}
	

}

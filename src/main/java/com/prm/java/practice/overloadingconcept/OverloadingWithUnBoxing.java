package com.prm.java.practice.overloadingconcept;

public class OverloadingWithUnBoxing {
	
	// Autoboxing : int data type to Integer wrapper class 
	
		// unboxing : Integer wrapper class object to int data type
	
		public OverloadingWithUnBoxing() {
			super();
		}
		
		public void calculateArea(double d) {
			
			// Automatically convert Double wrapper class object to double data type
			
			System.out.println("Area: " + d);
		}
		
		public void calculateArea(int i) {
			
			//Automatically convert Integer wrapper class object to int data type
			
			System.out.println("Area: " + i);
			
		}

}

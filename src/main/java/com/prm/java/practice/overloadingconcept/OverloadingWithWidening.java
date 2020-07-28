package com.prm.java.practice.overloadingconcept;

public class OverloadingWithWidening {
	
/* Type casting
	
		 Widening : Converting lower data types to higher data types 
	e.g. Converting int data type to long data type 
	
		 Down casting : Converting higher data types to lower data types 
		 e.g. Converting int data type to short data type
		
		Down casting is not allowed in case of overloading
		
	 	Down casting:  Not Allowed: 
	 	different wrapper class and Different type of data type conversion is not possible 
	 	eg. Long wrapper class can not be changed to int data type class
	 	
	 	eg. it only deals with the primitive data types and not with the wrapper class conversion.
	 	
	 	if wrapper class conversion is involved  then it is called as "Auto boxing and un-boxing" and not widening and down casting

*/	
		public OverloadingWithWidening() {
			super();
		}
		
		public void printWithWidening(long d) {
			
			// Widening : Converting lower data types to higher data types e.g. Converting int data type to long data type
			
			System.out.println(d);
		}
		
		public void printWithWidening(double i) {
			
			// Widening : Converting lower data types to higher data types e.g. Converting int data type to long data type
			
			System.out.println(i);
			
		}



}

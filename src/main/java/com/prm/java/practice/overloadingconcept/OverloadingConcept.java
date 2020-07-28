package com.prm.java.practice.overloadingconcept;



public class OverloadingConcept {

	// same method name with different method signature
	
	public OverloadingConcept() {
		super();
	}
	
	public void parent(String child) {
		
		System.out.println("Preeti has one kid named: " + child);
		
	}
	

	public void parent(String child1, String child2) {
		
		System.out.println("Shilpa has 2 kids named: " + child1 +" "+ child2 );
	}
}

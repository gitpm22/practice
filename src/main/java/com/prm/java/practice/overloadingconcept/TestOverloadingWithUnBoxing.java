package com.prm.java.practice.overloadingconcept;

public class TestOverloadingWithUnBoxing {

	public static void main(String[] args) {
		
		OverloadingWithUnBoxing obj = new OverloadingWithUnBoxing();
		
		obj.calculateArea(new Double(11.1));
		obj.calculateArea(new Integer(6));

	}

}

package com.prm.java.practice.overloadingconcept;

public class TestOverloadingWithAutoBoxing {

	public static void main(String[] args) {
		
		OverloadingWithAutoBoxing obj = new OverloadingWithAutoBoxing();
		
		obj.calculateArea(10.5f);
		obj.calculateArea(5);
		
		// obj.calculateArea(10L); // other than double is not allowed in case of auto boxing
	}

}

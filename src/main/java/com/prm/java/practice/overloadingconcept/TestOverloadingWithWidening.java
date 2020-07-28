package com.prm.java.practice.overloadingconcept;

public class TestOverloadingWithWidening {

	public static void main(String[] args) {
		
		// down casting is not allowed in overloading concept
		
		OverloadingWithWidening obj = new OverloadingWithWidening();
		
		obj.printWithWidening('x'); // passing Ascii value of x output should be 120
		obj.printWithWidening(0.5f);
		
		obj.printWithWidening(12); // passing integer value to long
	}

}

package com.prm.java.practice.java8;

public interface InterfaceWithDefaultMethod {
	
	// we can not override existing method (java.lang.object) by defining default method
	
	// eg. default boolean equals(Object o) {}
	
	default void show() {
		
		System.out.println("Default Method from interface ");
	}
	
	static void display() {
		
		System.out.println("Static method from interface");
	}

}

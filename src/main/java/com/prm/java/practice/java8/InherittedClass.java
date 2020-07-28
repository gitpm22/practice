package com.prm.java.practice.java8;

public class InherittedClass extends DefaultMethodInInterface {
	
	
	public void show() {
		
		System.out.println("Show() Method from extended class : InherittedClass");
	}
	

	public static void main(String[] args) {
		
		InherittedClass obj = new InherittedClass();

		obj.show();
		InterfaceWithDefaultMethod.display();

	}

}

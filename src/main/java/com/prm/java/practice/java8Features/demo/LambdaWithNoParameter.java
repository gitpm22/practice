package com.prm.java.practice.java8Features.demo;

public class LambdaWithNoParameter {

	public static void main(String[] args) {

		int a = 5;
		float b = 10;
		String name = "Preeti";


		System.out.println("Output Using show method of showable interface");

		Showable show1 = ()-> System.out.println(a); // passed the implementation of show method to reference of Showable interface
		show1.show(); // method call

		Showable show2 = ()-> System.out.println(b);
		show2.show();

		Showable show3 = ()-> System.out.println(name);
		
		show2.show();
	}

}

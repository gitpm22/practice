package com.prm.java.practice.java8Features.demo;

public class Client {

	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		
		Computable add = (int x, int y) -> x + y; 
		
		Computable sub = (int x, int y) -> x - y; 
		
		Calculator calc = new Calculator();
		
		int output1 = calc.calculate(a, b, add);
		
		int output2 = calc.calculate(a, b, sub);
		
		System.out.println(output1); // its similar to below statement
		//System.out.println(add.compute(1, 2));
		
		System.out.println(output2);
		
		Computable innerC = new Computable() {
			
			@Override
			public int compute(int a, int b) {
				return a*b;
			}
		};
		

		int output3 = calc.calculate(a, b, innerC);
		
		System.out.println(output3); // its similar to below statement
		//System.out.println(innerC.compute(5, 10));
		
		System.out.println("Output Using show method of showable interface");

		Showable show1 = ()-> System.out.println(output1); // passed the implementation of show method
		show1.show(); // method call

		Showable show2 = ()-> System.out.println(output2);
		show2.show();

		Showable show3 = ()-> System.out.println(output3);
		show2.show();

	}

}

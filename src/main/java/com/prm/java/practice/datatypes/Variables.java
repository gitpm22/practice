
package com.prm.java.practice.datatypes;

public class Variables {
	
	int a = 100; // instance variable
	
	static float b = 2.5f; // static variable
	
	public int addNumbers (int a, int b) {
		
		int p = a; // local variables
		int q = b;
		
		int sum = p+q;
		
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables objOfVariable = new Variables();
		
		System.out.println("a = "+ objOfVariable.a);
		System.out.println("b = " + objOfVariable.b);
		
		System.out.println("sum = "+ objOfVariable.addNumbers(11, 22));
		
		//System.out.println(objOfVariable.sum);
		
		//static boolean b = "true";
		
	}

}

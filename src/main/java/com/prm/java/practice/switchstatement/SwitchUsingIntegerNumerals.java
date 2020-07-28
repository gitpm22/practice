package com.prm.java.practice.switchstatement;

public class SwitchUsingIntegerNumerals {
	

	public static void main(String[] args) {

		// Allowed data types for switch expression
		// byte, short, int, char
		
		// Not allowed data types for switch expression 
		// long, float, double, boolean
		
		byte b = 010;
		

		switch (b) {

		case 101:
			System.out.println("101 is executed");
			break;

		case 010:
			System.out.println(" 010 is executed");
		break;	

		default:

			System.out.println("Default is executed");

		}
		
		int a = 1;
		switch (a+2) { // sum of expression is 3 so 3 will be compared to given case vales
		case 1:
			System.out.println("1");
			break;
			
		case 3:
			System.out.println("3");
			break;

		default:
			System.out.println("Default");
			break;
		}
	}
}
